<<<<<<< HEAD
import org.sikuli.script.FindFailed;
import org.sikuli.script.*;

import java.util.concurrent.TimeUnit;

class Emulator {
	private Screen screen = new Screen();
	
	// initialise emulator by selecting icon in IC4 tool
	void init(){
		try{
			screen.click("img/icoEmSignals.png");
	        screen.click(screen.wait("img/icoOK.png"),5);
	        screen.click(screen.wait("img/icoOK.png"),5);
	        Thread.sleep(5000);
		}
		catch(FindFailed | InterruptedException e){
	    	e.printStackTrace();
	    }
	}

	// click on one of the items to allow enabling by text
	void preSimulation(){
	    pause(5);
        try {
            clearAll();
            screen.click("img/IO_ASL1.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

	void pause(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // clear all I/O button
    void clearAll(){
        try {
            screen.find("img/btnClearAll.png");
            screen.click("img/btnClearAll.png");
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }

    // deactivate emulator
    void deactivate(){
        try {
            screen.find("img/btnDeactivate.png");
            screen.click("img/btnDeactivate");
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }

	// exit emulator
	void exit(){
		try {
			screen.find("img/btn_Emu_FileView.png");
			screen.click("img/btn_Emu_File");
			screen.find("img/btn_Emu_ChangeExit.png");
			screen.click("img/btn_Emu_Exit.png");
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}
}
=======
import org.sikuli.script.FindFailed;
import org.sikuli.script.*;

import java.util.concurrent.TimeUnit;

class Emulator {
	private Screen screen = new Screen();
	
	// initialise emulator by selecting icon in IC4 tool
	void init(){
		try{
			screen.click("img/icoEmSignals.png");
	        screen.click(screen.wait("img/icoOK.png"),5);
	        screen.click(screen.wait("img/icoOK.png"),5);
	        Thread.sleep(5000);
		}
		catch(FindFailed | InterruptedException e){
	    	e.printStackTrace();
	    }
	}

	// click on one of the items to allow enabling by text
	void preSimulation(){
	    pause(5);
        try {
            clearAll();
            screen.click("img/IO_ASL1.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

	void pause(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // clear all I/O button
    void clearAll(){
        try {
            screen.find("img/btnClearAll.png");
            screen.click("img/btnClearAll.png");
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }

    // deactivate emulator
    void deactivate(){
        try {
            screen.find("img/btnDeactivate.png");
            screen.click("img/btnDeactivate");
        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }

	// exit emulator
	void exit(){
		try {
			screen.find("img/btn_Emu_FileView.png");
			screen.click("img/btn_Emu_File");
			screen.find("img/btn_Emu_ChangeExit.png");
			screen.click("img/btn_Emu_Exit.png");
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}
}
>>>>>>> d3a6b7013ff3ae0170b0802eb9e932cf4fdc4e70
