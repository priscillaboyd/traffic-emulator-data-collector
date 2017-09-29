import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class MossleyAvenueWB implements Approach {

    String description = "Mossley Avenue SB";
    private ListMultimap<String, String> map;

    MossleyAvenueWB(){
        addEquipment();
    }

    @Override
    public void setDirection(direction direction) {
        setDirection(Approach.direction.WESTBOUND);
    }

    @Override
    public void setType(type type) {
        setType(Approach.type.VEHICLE);
    }

    //add associated equipment
    public void addEquipment() {
        map = ArrayListMultimap.create();
        map.put("C", "CSL1");
        map.put("C", "SLDC02");
        map.put("C", "MVDC02");
    }

    public ListMultimap<String, String> getEquipmentMap(){
        return map;
    }
}
