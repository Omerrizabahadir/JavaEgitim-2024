package map_example_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample02 {

    public static void main(String[] args) {
        Map<Integer,String>userMap=new HashMap<>();
        userMap.put(123,"Hasan");
        userMap.put(124,"null");
        userMap.put(null,null);

        System.out.println(userMap);

        System.out.println("-------------------");

        userMap.putIfAbsent(125,"bilgeadam");
        userMap.putIfAbsent(125,"bilgeadam1");
        System.out.println(userMap);

        System.out.println("-------------------");

        userMap.get(126);
        userMap.getOrDefault(543,"defaultValue");
        System.out.println(userMap);

        System.out.println("-----------------");
    }
}
