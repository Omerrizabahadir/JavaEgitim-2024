package map_example_creating_Hashmap_from_other_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main01 {
    public static void main(String[] args) {
        //create a treeMap

        Map<String, Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);

        System.out.println("TreeMap : " + evenNumbers);

        //create HashMap from TreeMap

        HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
        numbers.put("Thre", 3);
        System.out.println("HashMap : " + numbers);

    }
}
