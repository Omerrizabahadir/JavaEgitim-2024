package LinkedHashSet;


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample03 {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("LinkedHashSet: " + numbers);

        boolean remove1 = numbers.remove(5);
        System.out.println("After remove 5 : "+remove1);
        System.out.println("After remove 5, numbers list is remove 5 : "+numbers);

        boolean remove2 =numbers.remove(4);
        System.out.println("Is 4 removed : "+remove2);
        System.out.println("4 is not found in numbers list : "+numbers);

        boolean remove3 = numbers.removeAll(numbers);
        System.out.println("After remove all : "+remove3);
        System.out.println("After remove all numbers list is empty : "+numbers);


    }
}
