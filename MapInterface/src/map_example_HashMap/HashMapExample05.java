package map_example_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample05 {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();

        System.out.println("--------put()--------");

        userMap.put(3, "ali");
        userMap.put(1, "galip");
        userMap.put(2, "galip");
        userMap.put(1, "ali");
        userMap.put(null, "yaren");
        //userMap.put(1,null);


        System.out.println(userMap);

        System.out.println("--------containsKey()--------");

        Boolean keyContain = userMap.containsKey(1);
        System.out.println(keyContain);
        Boolean keyContain1 = userMap.containsKey(5);
        System.out.println(keyContain1);


        System.out.println("--------replaceAll()--------");

        //replaceAll key null olabilir ancak value null olursa NullPointerException hatası verir

        System.out.println("ReplaceAll öncesi :" + userMap);
        userMap.replaceAll((key, value) -> value.toUpperCase());

        System.out.println("ReplaceAll sonrası " + userMap);


        System.out.println("--------for each döngüsü--------");

        System.out.println("forecah ile (value)value'ları yazdırma :");
        for (String values : userMap.values()) {
            System.out.println(values);

        }
        System.out.println("forecah ile (key)keyleri yazdırma :");
        for (Integer keys : userMap.keySet()) {
            System.out.println(keys);
        }


    }
}