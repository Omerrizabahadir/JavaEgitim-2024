package map_example_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap02 {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);

        //print the LinkedHashMap
        System.out.println("LinkedHashMap : " + linkedHashMap);

        //Accessing elements

        System.out.println("Value of Three : " + linkedHashMap.get("Three"));

        //remove key from LinkedHashMap list

        linkedHashMap.remove("One");
        System.out.println("After the removing : ");
        System.out.println(linkedHashMap);

    }
}
