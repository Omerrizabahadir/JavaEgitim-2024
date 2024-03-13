package TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample02 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet : "+numbers);

        Iterator<Integer>iterate=numbers.iterator();
        System.out.println("TreeSet using Iterator with using while loop");
        while (iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.println(", ");

        }
        System.out.println("TreeSet using Iterator with for each loop : ");
        for (Integer value : numbers){
            System.out.println(value);
        }
    }
}
