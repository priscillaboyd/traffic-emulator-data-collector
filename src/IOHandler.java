import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class IOHandler{
	
	void initIOList(Screen s){
		try{
	        s.click(s.wait("img/btnClearAll.png"),5);
			s.click("img/IO_ASL1.png");
			s.type("PBH06");
			s.click("img/btnActivate.png");
			Thread.sleep(5000);
			s.click("img/btnDeactivate.png");
	    }
	    catch(FindFailed | InterruptedException e){
	    	e.printStackTrace();
	    }
	}
	
}
