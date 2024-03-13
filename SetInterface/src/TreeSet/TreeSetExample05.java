package TreeSet;

import java.util.TreeSet;

public class TreeSetExample05 {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        System.out.println("TreeSet: " + numbers);

        // Using higher(). 4'ten büyük ama 4'e en yakın olanı verir.
        int higherNumber=numbers.higher(4);
        System.out.println("Higher than 4 : "+higherNumber);

        // Using lower(). 4'ten küçük ama 4'e en yakın olanı verecek.
        System.out.println("Lower than 4 : "+numbers.lower(4));

        // Using ceiling(). Kendisi varsa sayının onu yazacak. sayının kendisi yoksa bir üstünü yazacak
        System.out.println("Using ceiling for 3 : "+numbers.ceiling(3));


        System.out.println("Using ceiling for 4 : "+numbers.ceiling(4));

        // Using floor()

        System.out.println("Using floor for 2 : "+numbers.floor(2));
        System.out.println("Using floor for 6 : "+numbers.floor(8));
    }
}
