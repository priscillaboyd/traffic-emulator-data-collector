import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class MossleyAvenueEB implements Approach {

    String description = "Mossley Avenue EB";
    private ListMultimap<String, String> map;

    MossleyAvenueEB(){
        addEquipment();
    }

    @Override
    public void setDirection(direction direction) {
        setDirection(Approach.direction.EASTBOUND);
    }

    @Override
    public void setType(type type) {
        setType(Approach.type.VEHICLE);
    }

    //add associated equipment
    public void addEquipment() {
        map = ArrayListMultimap.create();
        map.put("D", "DSL1");
        map.put("D", "SLDD07");
        map.put("D", "MVDD07");
    }

    public ListMultimap<String, String> getEquipmentMap(){
        return map;
    }
}