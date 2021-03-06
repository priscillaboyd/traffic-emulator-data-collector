import com.google.common.collect.ListMultimap;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;

class Car {
    private Screen s = new Screen();
    private Random random = new Random();

    // calculates the run period (random if range is given, fixed if min=max)
    private void runForPeriod(int minSeconds, int maxSeconds){
        int period;
        // if min/max is the same, don't bother calculating the random
        if (minSeconds == maxSeconds)
            period = maxSeconds;
        else period = random.nextInt((maxSeconds - minSeconds) + 1) + minSeconds;

        try {
            activate();
            TimeUnit.SECONDS.sleep(period);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // activate simulation
    private void activate(){
        try{
            s.click("img/btnActivate.png");
        }
        catch (FindFailed e) {
            e.printStackTrace();
        }
    }

    // deactivate simulation
    private void deactivate(){
        try{
            s.click("img/btnDeactivate.png");
        }
        catch (FindFailed e) {
            e.printStackTrace();
        }
    }

    // move car at given pace
    void move(ListMultimap<String, String> multimap, int numCycles, String congestionLevel, String mode) {
        Set<String> keys = multimap.keySet();
        for (String phase : keys) {
            Collection<String> IO = multimap.get(phase);
            for (int i=0; i<numCycles; i++){
                for (String value : IO) {
                    s.type(value);
                    System.out.println(value);
                    switch (congestionLevel) {
                        case "low":
                            runForPeriod(120, 150); //2 min to 2.5 min
                            break;
                        case "medium":
                            runForPeriod(30, 60); //0.5 min to 1 min
                            break;
                        case "high":
                            runForPeriod(5, 5); // 5 seconds
                            break;
                    }
                    // if mode is 'sequence', then de-activate detector
                    if (mode.equals("sequence"))
                        deactivate();
                }
            }
        }

    }

}