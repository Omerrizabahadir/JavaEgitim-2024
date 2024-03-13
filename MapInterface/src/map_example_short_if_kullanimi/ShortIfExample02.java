package map_example_short_if_kullanimi;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class ShortIfExample02 {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(5, "E");
        treeMap.put(2, "B");
        treeMap.put(4, "D");
        System.out.println("Original TreeMap : " + treeMap);


        //Short if kullanarak son elemanı siliyorum
         Map.Entry<Integer,String> lastEntry = treeMap.isEmpty() ? null : treeMap.pollLastEntry();
        //Map.Entry<Integer, String> lastEntry = treeMap.lastEntry() == null ? null : treeMap.pollLastEntry();
        //Map.Entry<Integer, String> lastEntry = Objects.isNull(treeMap.lastEntry()) ? null :treeMap.pollLastEntry();
       // Map.Entry<Integer, String> lastEntry = Objects.nonNull(treeMap.lastEntry()) ? treeMap.pollLastEntry(): null;

        System.out.println("short if ile son elemanı sil : " + lastEntry);
        System.out.println("Treemap'in son hali : " + treeMap);

    }
}
