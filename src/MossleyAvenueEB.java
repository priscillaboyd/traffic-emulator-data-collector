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

    public void addEquipment() {
        map = ArrayListMultimap.create();
        map.put("C", "DSL1");
        map.put("B", "SLDD07");
        map.put("B", "MVDD07");
    }

    public ListMultimap<String, String> getEquipmentMap(){
        return map;
    }
}
