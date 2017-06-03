import org.sikuli.script.FindFailed;
import org.sikuli.script.*;

//Responsible for loading and closing the emulator / modules
public class emulatorHandler {
	Screen s = new Screen();
	IOHandler io = new IOHandler();
	
	//Initialise emulator
	void initEmulator(){
		try{
			s.click("img/icoEmSignals.png");
	        s.click(s.wait("img/icoOK.png"),5);
	        s.click(s.wait("img/icoOK.png"),5);
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
	void initModules(){
		io.initIOList(s);
	}
	
	void exitEmulator(){
		try {
			s.find("img/btn_Emu_FileView.png");
			s.click("img/btn_Emu_File");
			s.find("img/btn_Emu_ChangeExit.png");
			s.click("img/btn_Emu_Exit.png");
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}
}
