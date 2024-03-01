package map_example_creating_hashmap_from_other_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main02 {
    public static void main(String[] args) {
        //create an instance of TreeMap

        Map<String, String> tm = new TreeMap<>();
        tm.put("James", "Bond");
        tm.put("Scarlett", "Johanson");
        tm.put("Apurva", "Bhatt");

        System.out.println("TreeMap : " + tm);



        Map<String, String> hm = new HashMap<>();
        //Treemap içindekileri HashMap oluşturup içine atıcaz
        hm.putAll(tm);
        System.out.println("HashMap : " + hm);


    }
}
