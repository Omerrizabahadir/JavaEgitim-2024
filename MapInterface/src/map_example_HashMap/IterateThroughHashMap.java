package map_example_HashMap;

import java.util.HashMap;

public class IterateThroughHashMap {
    public static void main(String[] args) {
       // create a hashmap

        HashMap<Integer,String>languages=new HashMap<>();
        languages.put(1,"Java");
        languages.put(2,"Python");
        languages.put(3,"JavaScript");
        System.out.println("HashMap : "+languages);

        //Iterate through keys only
        //HashMap aracılığıyla yineleme

        System.out.println("Keys : "+languages.entrySet());



    }
}
