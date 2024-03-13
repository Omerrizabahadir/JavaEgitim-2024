package map_example_creating_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample08 {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "A");
        treeMap.put(3, "B");
        treeMap.put(5, "C");
        treeMap.put(7, "D");
        treeMap.put(9, "E");


        //higherKey() örneği 3 keyinin üstündeki en düşük key
        System.out.println("higherKey(3) : " + treeMap.higherKey(3));

        //higherEntry() örneği 3ün üstündekilerden en düşük olanın value su
        Map.Entry<Integer, String> higherEntry = treeMap.higherEntry(3);
        System.out.println("higherEntry(3) : " + higherEntry.getKey() + " -> " + higherEntry.getValue());

        // lowerKey() örneği  5'in altındaki keylerden en büyük döner
        System.out.println("lowerKey(3): " + treeMap.lowerKey(5));


        //lowerEntry() örneği 5'in altındaki en büyük key döner
        Map.Entry<Integer, String> lowerEntry = treeMap.lowerEntry(5);
        System.out.println("lowerEntry(7) :" + lowerEntry.getKey() + " -> " + lowerEntry.getValue());

        //ceiling key örneği 4 keyinin üstündeki keylerden en düşük olanı verecek
        System.out.println("ceilingKey(4) :" + treeMap.ceilingKey(4));

        // ceilingEntry() örneği  4'ün üstündeki keylerden en düşük olanın value'su döner
        Map.Entry<Integer, String> ceilingEntry = treeMap.ceilingEntry(4);
        System.out.println("ceilingEntry(4): " + ceilingEntry.getKey() + " -> " + ceilingEntry.getValue());


        // floorKey() örneği 6 dan küçük keylerden en büyüğü döner
        System.out.println("floorKey(6): " + treeMap.floorKey(6));

        //floorEntyry() örneği  6 dan küçük keylerden en büyüğünün value'su döner
        Map.Entry <Integer, String> floorEntry = treeMap.floorEntry(6);
        System.out.println("floorEntry(6) : "+floorEntry.getKey()+" -> " +floorEntry.getValue());
    }
}