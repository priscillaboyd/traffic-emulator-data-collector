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

    public void addEquipment() {
        map = ArrayListMultimap.create();
        map.put("C", "CSL1");
        map.put("B", "SLDC02");
        map.put("B", "MVDC02");
    }

    public ListMultimap<String, String> getEquipmentMap(){
        return map;
    }
}
