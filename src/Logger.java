import java.io.IOException;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Logger {

	private String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    
	private Path src = Paths.get("C:/Users/Public/Documents/IC4/Data/LOG/E80374 Issue 1.8LG");
    private Path target = Paths.get("C:/Users/Public/Documents/IC4/Data/LOG/" + timeStamp + ".csv");
    
    //overwrite existing file, if exists
	private CopyOption[] options = new CopyOption[]{
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