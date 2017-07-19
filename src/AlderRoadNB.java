import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class AlderRoadNB implements Approach {

    String description = "Alder Road NB";
    private ListMultimap<String, String> map;

    AlderRoadNB(){
        addEquipment();
    }

    @Override
    public void setDirection(Approach.direction direction) {
        setDirection(Approach.direction.NORTHBOUND);
    }

    @Override
    public void setType(Approach.type type) {
        setType(Approach.type.VEHICLE);
    }

    public void addEquipment() {
        map = ArrayListMultimap.create();
        map.put("A", "ASL1");
        map.put("A", "SLDA05");
        map.put("A", "MVDA05");
    }

    public ListMultimap<String, String> getEquipmentMap(){
        return map;
    }
}
