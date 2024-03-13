package TreeSet;

import java.util.TreeSet;

public class TreeSetExample03 {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        boolean remove1 = numbers.remove(2);
        System.out.println("After removing 2 : "+numbers);

        boolean removeAll = numbers.removeAll(numbers);
        System.out.println("Are all elements remove  : "+removeAll);
        System.out.println("TreeSet list after removing: "+numbers);

    }
}
