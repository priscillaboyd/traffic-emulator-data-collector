import com.google.common.collect.ListMultimap;

public interface Approach {

    String description = null;

    enum direction{
        NORTHBOUND,
        SOUTHBOUND,
        EASTBOUND,
        WESTBOUND
    }

    enum type{
        VEHICLE,
        PEDESTRIAN
    }

    void setDirection(Approach.direction direction);

    void setType(Approach.type type);

    void addEquipment();

    ListMultimap<String, String> getEquipmentMap();

}
