package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample07 {
    public static void main(String[] args) {

        Set<Integer> numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(null);


        System.out.println("HashSet 1 : "+numbers);

        Set<Integer>primeNumbers=new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(null);

        System.out.println("HashSeT 2 : "+primeNumbers);

        //Check if prime numbers is a subset of numbers
        //prime numbers numbers'ın alt kümesi mi?

        boolean result =numbers.containsAll(primeNumbers);
        System.out.println("Is HashSet1 is subset of numbers : "+result);

        boolean result2=numbers.contains(5);
        System.out.println("Is HashSet1 contains 5 : "+result2);
    }
}
