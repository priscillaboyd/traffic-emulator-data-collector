import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class AlderRoadSB implements Approach {

    String description = "Alder Road SB";
    private ListMultimap<String, String> map;

    AlderRoadSB(){
        addEquipment();
    }

    @Override
    public void setDirection(direction direction) {
        setDirection(Approach.direction.SOUTHBOUND);
    }

    @Override
    public void setType(type type) {
        setType(Approach.type.VEHICLE);
    }

    public void addEquipment() {
        map = ArrayListMultimap.create();
        map.put("B", "BSL1");
        map.put("B", "SLDB10");
        map.put("B", "MVDB10");
    }

    public ListMultimap<String, String> getEquipmentMap(){
        return map;
    }
}
