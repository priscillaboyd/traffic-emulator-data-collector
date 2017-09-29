<<<<<<< HEAD
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
        map.put("D", "DSL1");
        map.put("D", "SLDD07");
        map.put("D", "MVDD07");
    }

    public ListMultimap<String, String> getEquipmentMap(){
        return map;
    }
}
=======
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
        map.put("D", "DSL1");
        map.put("D", "SLDD07");
        map.put("D", "MVDD07");
    }

    public ListMultimap<String, String> getEquipmentMap(){
        return map;
    }
}
>>>>>>> d3a6b7013ff3ae0170b0802eb9e932cf4fdc4e70
