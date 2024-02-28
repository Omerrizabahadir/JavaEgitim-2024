package example_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //creating List using with ArrayList class
        List<Integer> numbers=new ArrayList<>();

        //Add elements to the List
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("List : "+numbers);


        // access element from the List
        int number=numbers.get(2);
        System.out.println("Access element : "+number);


        //Remove element from the List

        int removeNumber=numbers.remove(3);
        System.out.println("Remove element : "+removeNumber);

    }
}