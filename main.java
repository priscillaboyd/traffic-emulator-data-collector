import java.util.concurrent.TimeUnit;

class main {
    public static void main(String[] args) throws InterruptedException {
        DataGenerator d = new DataGenerator();
        d.generateData();
    	
//    	//NOTE: Need to ensure the program is closed in order to move log!
//		Logger log = new Logger();
//		log.archiveLog();
    }
}