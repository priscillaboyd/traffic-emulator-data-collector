import org.sikuli.script.FindFailed;
import org.sikuli.script.*;

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
