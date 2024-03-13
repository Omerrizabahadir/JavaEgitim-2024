package map_example_creating_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample01 {
    public static void main(String[] args) {
        //creating TreeMap of even Numbers

        //SortedMap<String,Integer>evenNumbers =new TreeMap<>(); bu da olur
        //TreeMap<String, Integer>evenNumbers=new TreeMap<>();  bu da olur
        Map<String, Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("TreeMap of even numbers : "+evenNumbers);

        System.out.println("-----------putIfAbsent(); metodu---------");

        Integer putIfAbsent1 = evenNumbers.putIfAbsent("Six", 6);
        Integer putIfAbsent2 = evenNumbers.putIfAbsent("Two", 2);
        System.out.println(putIfAbsent1);
        System.out.println(putIfAbsent2);

        System.out.println("putIfAbsent sonrası even numbers : "+evenNumbers);


        //creating TreeMap of numbers

        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One",1);

        System.out.println("-----------------------------");
        System.out.println("TreeMap of numbers : "+numbers);

        System.out.println("-------------putAll();---------");
        numbers.putAll(evenNumbers);

        System.out.println("putAll sonrası numbers : "+numbers);

    }
}
