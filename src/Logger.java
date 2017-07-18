import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

// Takes the IC4 log and saves to this package
public class Logger {
	
	//C:\Users\Public\Documents\IC4\Data\LOG
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    
	Path src = Paths.get("C:/Users/Public/Documents/IC4/Data/LOG/E80374 Issue 1.8LG");
    Path target = Paths.get("C:/Users/Public/Documents/IC4/Data/LOG/" + timeStamp + ".csv");
    
    //overwrite existing file, if exists
    CopyOption[] options = new CopyOption[]{
      StandardCopyOption.REPLACE_EXISTING,
      StandardCopyOption.COPY_ATTRIBUTES
    };
    
    void archiveLog(){
    	try {
    		TimeUnit.SECONDS.sleep(5); //simple wait to ensure program has terminated
			Files.copy(src, target, options);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
    }
}