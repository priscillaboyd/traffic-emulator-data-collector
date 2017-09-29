<<<<<<< HEAD
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
        map.put("C", "SLDC02");
        map.put("C", "MVDC02");
    }

    public ListMultimap<String, String> getEquipmentMap(){
        return map;
    }
}
=======
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
        map.put("C", "SLDC02");
        map.put("C", "MVDC02");
    }

    public ListMultimap<String, String> getEquipmentMap(){
        return map;
    }
}
>>>>>>> d3a6b7013ff3ae0170b0802eb9e932cf4fdc4e70
