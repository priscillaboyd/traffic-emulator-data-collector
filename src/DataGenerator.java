class DataGenerator {

    private Car c = new Car();
    private Emulator e = new Emulator();
    private AlderRoadNB alderRoadNB = new AlderRoadNB();
    private AlderRoadSB alderRoadSB = new AlderRoadSB();
    private MossleyAvenueWB mossleyAvenueWB = new MossleyAvenueWB();
    private MossleyAvenueEB mossleyAvenueEB = new MossleyAvenueEB();

    private void noCongestionAllApproaches(){
        System.out.println(">> Simulating no congestion at all approaches...");
        c.simulateCongestion(alderRoadNB.getEquipmentMap(), 10, "low", "sequence");
        c.simulateCongestion(alderRoadSB.getEquipmentMap(), 10, "low", "sequence");
        c.simulateCongestion(mossleyAvenueWB.getEquipmentMap(), 10, "low", "sequence");
        c.simulateCongestion(mossleyAvenueEB.getEquipmentMap(), 10, "low", "sequence");
    }

    private void intermittentCongestionAllApproaches(){
        System.out.println(">> Simulating intermittent congestion on all approaches...");
        c.simulateCongestion(alderRoadNB.getEquipmentMap(), 10, "medium", "sequence");
        c.simulateCongestion(alderRoadSB.getEquipmentMap(), 10, "medium", "sequence");
        c.simulateCongestion(mossleyAvenueWB.getEquipmentMap(), 10, "medium", "sequence");
        c.simulateCongestion(mossleyAvenueEB.getEquipmentMap(), 10, "medium", "sequence");
    }

    private void congestionAllApproaches(){
        System.out.println(">> Simulating intermittent congestion on all approaches...");
        c.simulateCongestion(alderRoadNB.getEquipmentMap(), 1, "high", "sequence");
        c.simulateCongestion(alderRoadSB.getEquipmentMap(), 1, "high", "sequence");
        c.simulateCongestion(mossleyAvenueWB.getEquipmentMap(), 1, "high", "sequence");
        c.simulateCongestion(mossleyAvenueEB.getEquipmentMap(), 1, "high", "sequence");
    }

    private void congestionAlderRoadBothWays(){
        System.out.println(">> Simulating congestion for Alder Rd both ways...");
        c.simulateCongestion(alderRoadNB.getEquipmentMap(), 1, "high", "sequence");
        c.simulateCongestion(alderRoadSB.getEquipmentMap(), 1, "high", "sequence");
    }

    private void congestionMossleyAvenueBothWays(){
        System.out.println(">> Simulating congestion for Mossley Ave both ways...");
        c.simulateCongestion(mossleyAvenueWB.getEquipmentMap(), 1, "high", "sequence");
        c.simulateCongestion(mossleyAvenueEB.getEquipmentMap(), 1, "high", "sequence");
    }

    private void congestionAlderRoadNBMossleyAvenueWB(){
        System.out.println(">> Simulating congestion for Alder Rd NB and Mossley Avenue WB...");
        c.simulateCongestion(alderRoadNB.getEquipmentMap(), 1, "high", "sequence");
        c.simulateCongestion(mossleyAvenueWB.getEquipmentMap(), 1, "high", "sequence");
    }

    private void congestionAlderRoadSBMossleyAvenueWB(){
        System.out.println(">> Simulating congestion for Alder Rd SB and Mossley Ave WB...");
        c.simulateCongestion(alderRoadSB.getEquipmentMap(), 1, "high", "sequence");
        c.simulateCongestion(mossleyAvenueWB.getEquipmentMap(), 1, "high", "sequence");
    }

    private void congestionAlderRoadNBMossleyAvenueEB(){
        System.out.println(">> Simulating congestion for Alder Rd NB and Mossley Ave EB...");
        c.simulateCongestion(alderRoadNB.getEquipmentMap(), 1, "high", "sequence");
        c.simulateCongestion(mossleyAvenueEB.getEquipmentMap(), 1, "high", "sequence");
    }

    private void congestionAlderRoadSBMossleyAvenueEB(){
        System.out.println(">> Simulating congestion for Alder Rd SB and Mossley Ave EB...");
        c.simulateCongestion(alderRoadSB.getEquipmentMap(), 1, "high", "continuous");
        c.simulateCongestion(mossleyAvenueEB.getEquipmentMap(), 1, "high", "continuous");
    }

    void generateData(){
        e.init();
        e.preSimulation();

        noCongestionAllApproaches();
        e.pause(300);
        e.clearAll();

        intermittentCongestionAllApproaches();
        e.pause(60);
        e.clearAll();

        // run congested scenarios for half an hour each
        congestionAllApproaches();
        e.pause(1800);
        e.clearAll();

        congestionAlderRoadBothWays();
        e.pause(1800);
        e.clearAll();

        congestionMossleyAvenueBothWays();
        e.pause(1800);
        e.clearAll();

        congestionAlderRoadNBMossleyAvenueWB();
        e.pause(1800);
        e.clearAll();

        congestionAlderRoadSBMossleyAvenueWB();
        e.pause(1800);
        e.clearAll();

        congestionAlderRoadNBMossleyAvenueEB();
        e.pause(1800);
        e.clearAll();

        congestionAlderRoadSBMossleyAvenueEB();
        System.out.println("going again");
        e.pause(5);
        e.clearAll();

        e.exit();
    }

}