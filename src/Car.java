import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.util.*;

class Car {

    private ListMultimap<String, String> multimap = ArrayListMultimap.create();

    // simulate car detection based on its location
    void enableDetection(Screen s) {
        // add detectors by phase to the map
        multimap.put("A", "ASL1");
        multimap.put("A", "MVDA05");
        multimap.put("B", "BSL1");

        try {
            s.click(s.wait("img/btnClearAll.png"), 5);
            s.click("img/IO_ASL1.png");

            // create a set to store individual phases
            Set<String> keys = multimap.keySet();
            for (String phase : keys) {
                System.out.println("Phase = " + phase);

                // create collection to store list of IOs for given phase
                Collection<String> IO = multimap.get(phase);

                // activate each IO in the map within the emulator
                for (String value : IO) {
//                  s.type("PBH06");
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
