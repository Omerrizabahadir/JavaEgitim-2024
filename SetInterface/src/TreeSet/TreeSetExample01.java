import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample01 {
    public static void main(String[] args) {
        Set<Integer> evenNumbers = new TreeSet<>();

        // Using the add() method
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet: " + evenNumbers);

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        System.out.println("TreeSet with adding 1 : " + numbers);

        numbers.addAll(evenNumbers);

        System.out.println("New TreeSet : " + numbers);
    }
}