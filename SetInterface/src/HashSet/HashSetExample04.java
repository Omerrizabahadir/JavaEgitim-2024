package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample04 {
    public static void main(String[] args) {

        Set<Integer> evenNumbers=new HashSet<>();
        evenNumbers.add(6);
        evenNumbers.add(4);
        evenNumbers.add(2);

        System.out.println("HashSet1 even numbers : "+evenNumbers);

        HashSet<Integer>oddNumbers=new HashSet<>();
        oddNumbers.add(5);
        oddNumbers.add(3);
        oddNumbers.add(7);

        System.out.println("HashSet2 odd numbers : "+oddNumbers);

        Set<Integer>numbers=new HashSet<>();
        numbers.addAll(evenNumbers);
        numbers.addAll(oddNumbers);
        System.out.println("HashSet3 union of odd and even numbers : "+numbers);

    }
}
