package TreeSet;

import java.util.TreeSet;

public class TreeSetExample06 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        //using pollFirst()
        System.out.println("Remove first element : " + numbers.pollFirst());
        System.out.println("after pollFirst, number list is : " + numbers);

        //using pollLast()
        System.out.println("Remove flast element : " + numbers.pollLast());
        System.out.println("after pollLast, number list is : " + numbers);
    }
}
