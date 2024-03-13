package HashSet;

import java.util.HashSet;

public class HashSetExample05 {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet2: " + evenNumbers);

        //retainAll(); metodu ile İki set arasındaki kesişimi(intersection) gerçekleştirmek için
        evenNumbers.retainAll(primeNumbers);
        System.out.println("even numbers'a retainAll sonrası : " + evenNumbers);

        /*primeNumbers.retainAll(evenNumbers);
        System.out.println("prime numbers'a retainAll sonrası  : "+primeNumbers);
        */


    }
}
