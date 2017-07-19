import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

class main {
    public static void main(String[] args) {
    	Emulator e = new Emulator();

        ListMultimap<String, String> multimap = ArrayListMultimap.create();
        Car car = new Car(multimap);

    	e.init();
    	car.simulate();
    	e.exit();
    	
//    	//NOTE: Need to ensure the program is closed in order to move log!
//		Logger log = new Logger();
//		log.archiveLog();
    }
}