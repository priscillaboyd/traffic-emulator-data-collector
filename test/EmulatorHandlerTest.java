import org.junit.Test;

import static org.junit.Assert.*;

public class EmulatorHandlerTest {
    EmulatorHandler emulator = new EmulatorHandler();

    @Test
    public void EmulatorCannotBeInitialisedAsIconNotFound() throws Exception {
        try{
            emulator.init();
        }
        catch(final Exception e){
            String expectedMsg = "FindFailed: can not find img/icoEmSignals.png " +
                    "in S(0)[0,0 1920x1080]";
            assertEquals(e, e.getMessage());
        }
    }

}