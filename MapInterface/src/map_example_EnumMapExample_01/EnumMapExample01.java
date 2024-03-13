package map_example_EnumMapExample_01;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample01 {
    public static void main(String[] args) {
        Map<Days,String> enumMap=new EnumMap<>(Days.class);  //Days.class ile Hangi Enum'ın Map'i olduğunu göstermek zorundayız

        //Add key-value pairs
        enumMap.put(Days.MONDAY,"First day");
        enumMap.put(Days.TUESDAY,"Second day");
        enumMap.put(Days.WEDNESDAY,"Third day");


        // Access values using enum keys
        System.out.println("Value for Monday : "+enumMap.get(Days.MONDAY));
        System.out.println("Value for Tuesday : "+enumMap.get(Days.TUESDAY));
        System.out.println("Value for Wednesday : "+enumMap.get(Days.WEDNESDAY));

    }
}
