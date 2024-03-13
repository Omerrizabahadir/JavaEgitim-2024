package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample03 {
    public static void main(String[] args) {
        Set<Integer> numbers=new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("hashSet : "+numbers);

        //Using remove() method
        boolean value1=numbers.remove(5);
        System.out.println("Is 5 removed : "+value1);

        System.out.println("after remove : "+numbers);
        
        //numbers clear();
        boolean  value2=numbers.removeAll(numbers);
        //boolean value2=numbers.clear();
        System.out.println("after removeAll/clear : "+value2);

    }
}
