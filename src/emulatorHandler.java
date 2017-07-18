import org.sikuli.script.FindFailed;
import org.sikuli.script.*;

//Responsible for loading and closing the emulator / modules
class EmulatorHandler {
	private Screen screen = new Screen();
	private Car car = new Car();
	
	//Initialise emulator by selecting icon
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
		//Begin to init other modules
		initModules();
		exitEmulator();
	}
	
	//Initialise modules
    private void initModules(){
//		io.initIOList(screen);
        car.enableDetection(screen);
	}
	
	private void exitEmulator(){
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
