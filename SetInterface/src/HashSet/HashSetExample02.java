package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample02 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        //Using add() method

        numbers.add(4);
        numbers.add(2);
        numbers.add(2);
        numbers.add(6);
        System.out.println("HashSet : " + numbers);

        //Calling Iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.println("HashSet using Iterator : ");
       //Accessing elements
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
            System.out.println(", ");
        }
            //foreach döngüsü ile
            System.out.println("for each döngüsü ile :");
            for (Integer value: numbers){
                System.out.println(value);
            }

        System.out.println("-----remove() metodu--------");
            numbers.remove(2);
        System.out.println("After using remove method : "+numbers);

        //clear method
        numbers.clear();
        System.out.println("after clear / removeAll : "+numbers);

    }
}
