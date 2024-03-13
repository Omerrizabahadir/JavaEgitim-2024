package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample02 {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("LinkedHashSet :" + numbers);


        //Iterate (yineleme)
        Iterator<Integer> iterate = numbers.iterator();
        System.out.println("LinkedHashSet using Iterator with While : ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.println(", ");

        }
        System.out.println("LinkedHashSet using Iterator with foreach : ");
        for (Integer value : numbers) {
            System.out.println(value);


        }
    }
}
