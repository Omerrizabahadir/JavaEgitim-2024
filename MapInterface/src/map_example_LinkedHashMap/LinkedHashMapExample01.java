package map_example_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class LinkedHashMapExample01 {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new LinkedHashMap<>();
        numbers.put(5, "b");
        numbers.put(1, "z");
        numbers.put(3, "n");
        numbers.put(4, "m");
        numbers.put(6, "c");

        /*LinkedHashMap girildiği gibi tutar dataları.
         Eğer map'i sıralamak istersek böyle kullanabiliriz. -JAVA8
        */
        LinkedHashMap<Integer,String> a = numbers.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(toMap(Map.Entry ::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println(numbers);
    }

}
