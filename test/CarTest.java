import org.junit.Test;
import org.sikuli.script.Screen;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private Screen s = new Screen();
    private Emulator e = new Emulator();

    @Test
    public void DetectorProvidedIsActivatedThroughKeyboard(){
        e.init();
        assertEquals(1, s.type("ASL1"));
        e.exit();
    }

}