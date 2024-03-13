package map_example_creating_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample03 {
    public static void main(String[] args) {
        Map<String,Integer> numbers=new TreeMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        System.out.println("TreeMap : "+numbers);

        //using get() method

        Integer value=numbers.get("Three");
        System.out.println("get ile kullanım wrapper sınıfı ile : "+value);

        int value2=numbers.get("Five");//Eğer girilen key TreeMap içinde yoksa NullPointerException hatası verir.Çünkü primitive tipi cast edilemez
        System.out.println("get kullanım primitive ile : "+value2);

    }
}
