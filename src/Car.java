import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.util.*;

class Car {

    private ListMultimap<String, String> multimap = ArrayListMultimap.create();
    private Screen s = new Screen();

    Car(ListMultimap<String, String> multimap){
        this.multimap = multimap;
    }

    void addEntryToIOMap(String phase, String IO){
        multimap.put(phase, IO);
    }

    private void loadDetectorsAtOnce(){
        addEntryToIOMap("A", "ASL1");
        addEntryToIOMap("A", "MVDA05");
        addEntryToIOMap("B", "BSL1");
    }

    void simulate() {
        // add detectors to the map
        loadDetectorsAtOnce();

        // run simulation
        try {
            s.click(s.wait("img/btnClearAll.png"), 5);
            s.click("img/IO_ASL1.png");

            // create a set to store individual phases
            Set<String> keys = multimap.keySet();
            for (String phase : keys) {
                System.out.println("Phase = " + phase);

                // create collection to store list of IOs for given phase
                Collection<String> IO = multimap.get(phase);
                System.out.println("IO is " + IO);

                // activate each IO in the map within the emulator
                for (String value : IO) {
                    s.type(value);
                    s.click("img/btnActivate.png");
                    Thread.sleep(5000);
                    System.out.println("IO = " + value);
                    s.click("img/btnDeactivate.png");
                }
            }
        } catch (InterruptedException | FindFailed e) {
            e.printStackTrace();
        }
    }
}
