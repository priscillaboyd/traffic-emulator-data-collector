class main {
    public static void main(String[] args) {
    	Emulator e = new Emulator();
        Car car = new Car();

        // instantiate individual approaches
        AlderRoadNB alderRoadNB = new AlderRoadNB();
        AlderRoadSB alderRoadSB = new AlderRoadSB();
        MossleyAvenueWB mossleyAvenueWB = new MossleyAvenueWB();
        MossleyAvenueEB mossleyAvenueEB = new MossleyAvenueEB();

        // simulation with given approaches
    	e.init();
        car.simulate(alderRoadNB.getEquipmentMap());
        car.simulate(alderRoadSB.getEquipmentMap());
        car.simulate(mossleyAvenueWB.getEquipmentMap());
        car.simulate(mossleyAvenueEB.getEquipmentMap());
    	e.exit();
    	
//    	//NOTE: Need to ensure the program is closed in order to move log!
//		Logger log = new Logger();
//		log.archiveLog();
    }
}