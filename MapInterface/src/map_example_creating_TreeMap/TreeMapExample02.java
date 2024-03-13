package map_example_creating_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample02 {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println("Three Map : " + numbers);

        //using entrySet method
        System.out.println("---------entrySet()---------");

        System.out.println("entrySet : "+numbers.entrySet());

        //using keySet method
        System.out.println("---------keySet()---------");
        System.out.println("key set : "+numbers.keySet());

        //using values method
        System.out.println("---------values()---------");

        System.out.println("values : "+numbers.values());

    }
}
