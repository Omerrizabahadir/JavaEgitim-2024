package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public record LinkedHashSetExample01() {
    public static void main(String[] args) {
        Set<Integer> evenNumbers=new LinkedHashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("LinkedHashSet : "+evenNumbers);


        Set<Integer>numbers=new LinkedHashSet<>();
        numbers.addAll(evenNumbers);
        numbers.add(5);
        numbers.add(5);
        System.out.println("New LinkedHashSet : "+numbers);
    }
}
