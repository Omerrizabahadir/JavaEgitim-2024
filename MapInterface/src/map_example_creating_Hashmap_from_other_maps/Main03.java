package map_example_creating_Hashmap_from_other_maps;

import java.util.HashMap;
import java.util.TreeMap;

public class Main03 {
    public static void main(String[] args) {


        TreeMap<String, String> treemap = new TreeMap<>();
        treemap.put("A", "Apple");
        treemap.put("B", "Ball");
        treemap.put("C", "Cat");

        System.out.println(treemap);

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.putAll(treemap);
        System.out.println(hashMap);
        hashMap.putIfAbsent("D", "Dog");
        System.out.println(hashMap);


        String value=hashMap.get("B");
        System.out.println("Key B :"+value);
    }
}