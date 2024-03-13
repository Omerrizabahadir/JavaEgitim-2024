package map_example_creating_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample10 {
    public static void main(String[] args) {

        // TreeMap oluştur
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Anahtar-değer çiftlerini ekle
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(5, "E");
        treeMap.put(2, "B");
        treeMap.put(4, "D");

        // headMap() örneği
        // Map<Integer, String> headMap = treeMap.headMap(3); // Anahtar 3'e kadar olanları al

        //Anahtar 3'e kadar olanları al DEFAULT -> FALSE
        Map<Integer, String> headMap = treeMap.headMap(4,true);
        System.out.println("headmap(3) :");
        for (Map.Entry<Integer,String>entry : headMap.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
}
