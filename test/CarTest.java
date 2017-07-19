import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import org.junit.Test;
import org.sikuli.script.Screen;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private ListMultimap<String, String> multimap = ArrayListMultimap.create();
    private Car car = new Car(multimap);
    private Screen s = new Screen();
    private Emulator e = new Emulator();

    @Test
    public void DetectorProvidedIsActivatedThroughKeyboard(){
        e.init();
        assertEquals(1, s.type("ASL1"));
        e.exit();
    }

}