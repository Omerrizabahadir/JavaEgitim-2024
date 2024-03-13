package HashSet;

import java.util.HashSet;

public class HashSetExample06 {
    public static void main(String[] args) {


        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);


        //removeAll() metodu ile İki set arasındaki farkı hesaplamak için
        //iki sete bakar aynıları siler

        primeNumbers.removeAll(oddNumbers);
        System.out.println("removeAll sonrası primeNumbers : "+primeNumbers);


    }
}
