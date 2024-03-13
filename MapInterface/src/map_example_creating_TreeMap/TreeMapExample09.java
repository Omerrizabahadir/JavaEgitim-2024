package map_example_creating_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample09 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(5, "E");
        treeMap.put(2, "B");
        treeMap.put(4, "D");
        System.out.println("Original TreeMap : " + treeMap);


        //pollyFirstEntry() örneği map’in ilk key’i ile ilişkili girişi döndürür ve kaldırır
        Map.Entry<Integer, String> firstEntry = treeMap.pollFirstEntry();
        if (firstEntry != null) {
            System.out.println("pollFirstEntry(): " + firstEntry.getKey() + " -> " + firstEntry.getValue());
        } else {
            System.out.println("pollFirstEntry(): TreeMap is empty.");

        }
        /*
        uzunca if ile yazılışı
        //pollyLastEntry() örneği  haritanın son key’i ile ilişkili girişi döndürür ve kaldırır.
        Map.Entry<Integer,String>lastEntry=treeMap.lastEntry();
        if (treeMap.lastEntry() != null){
            System.out.println("pollyLastEntry : "+lastEntry.getKey()+" -> "+lastEntry.getValue() );

        }else {
            System.out.println("pollyLastEntry : TreeMap is empty");
        }
        */
        //pollyLastEntry with short if ile yazılışı
        Map.Entry<Integer, String> lastEntryWithShortIf = treeMap.isEmpty() ? null : treeMap.pollLastEntry();
        System.out.println("short if ile son değer siliniyor :"+lastEntryWithShortIf);
        System.out.println("treeMap son hali :"+treeMap);

        //kalan çiftleri gösterir.
        System.out.println("Remaining entries in TreeMap : ");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}