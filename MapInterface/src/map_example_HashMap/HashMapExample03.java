package map_example_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample03 {
    public static void main(String[] args) {
        Map<Integer, String> userMap=new HashMap<>();

        userMap.put(1,"burak");
        userMap.put(2,"ali");
        userMap.put(3,"yaren");
        userMap.put(4,"selma");
        userMap.put(null,"selam");
        userMap.put(6,null);
        userMap.put(null,null);

        System.out.println(userMap);


        System.out.println("-----replace()-------");

        userMap.replace(3,"ipek");
        userMap.replace(null,null,"gizem");

        System.out.println(userMap);

        System.out.println("------get()--------");

        userMap.get(null);

        for (Map.Entry<Integer, String>entry:userMap.entrySet()){
            System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());
        }
    }
}
