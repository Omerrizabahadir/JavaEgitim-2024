package map_example_creating_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample06 {
    public static void main(String[] args) {

        Map<Integer,String> userMap=new TreeMap<>();

        //Treemap te ""KEY null olamaz.Value null olabilir
        //userMap.put(null,"hello");
        userMap.put(1,"hello");

        System.out.println(userMap);


    }
}
