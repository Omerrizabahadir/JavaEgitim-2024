package map_example;

import java.util.HashMap;

public class HashMap04 {
    public static void main(String[] args) {
        //create an HashMap
        HashMap<String,Integer>primeNumbers=new HashMap<>();

        //add mappings to HashMap
        primeNumbers.put("two",2);
        primeNumbers.put("Three",3);
        System.out.println("Prime Numbers : "+primeNumbers);

        //create another HashMap

        HashMap<String,Integer>numbers=new HashMap<>();
        numbers.put("One",1);
        numbers.put("Four",22);

        System.out.println("Numbers : "+numbers);


        //add all mappings from primeNumbers to numbers
        numbers.putAll(primeNumbers);
        System.out.println("Numbers with added primeanumbers : "+numbers);
    }
}
