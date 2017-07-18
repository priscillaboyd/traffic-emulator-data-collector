class main {
    public static void main(String[] args) {
    	EmulatorHandler e = new EmulatorHandler();
    	e.initEmulator();
    	
    	//NOTE: Need to ensure the program is closed in order to move log!
    	Logger log = new Logger();
    	log.archiveLog();
    }
}