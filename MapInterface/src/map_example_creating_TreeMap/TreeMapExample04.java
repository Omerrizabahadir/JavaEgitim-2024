package map_example_creating_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample04 {
    public static void main(String[] args) {
        Map<String,Integer> numbers=new TreeMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        System.out.println("TreeMap : "+numbers);

        //using remove method with single parametre. Burada sadece key e bakar
        int value=numbers.remove("Two");
        System.out.println("Removed values : "+value);

        //using remove method with two parametre.Burada hem key hemde value 'ya bakar
        boolean result=numbers.remove("Three",3);
        System.out.println("Is the entry {Three=3} removed : "+result);


        System.out.println("TreeMap silmeden sonra son hali : "+numbers);



    }
}
