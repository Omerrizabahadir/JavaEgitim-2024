package TreeSet;

import java.util.TreeSet;

public class TreeSetExample04 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the first() method

        int firstNumber=numbers.first();
        System.out.println("First number is : "+firstNumber);

        //Using the last() method
        int lastNumber=numbers.last();
        System.out.println("Last Number is : "+lastNumber);

    }
}
