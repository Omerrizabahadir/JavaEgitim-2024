package example_arrayList_with_for_loop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Fish");
        System.out.println("ArrayList : "+animals);

        //iterate using for-each loop

        System.out.println(" Accessing individual elements : ");
        for (String str:animals){
            System.out.println(str);
            System.out.println(", ");
        }

    }
}
