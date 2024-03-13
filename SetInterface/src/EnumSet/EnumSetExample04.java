package EnumSet;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetExample04 {
    public static void main(String[] args) {
        //creating an EnumSet using allOf();
        Set<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("EnumSet : "+sizes);

        //Iterator()
        Iterator<Size> iterate=sizes.iterator();

        System.out.println("EnumSet : ");
        //using while loop for iteration
        System.out.println("-------while loop -----");
        while (iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.println(", ");

        }
        //using for loop for iteration
        System.out.println("-------foreach loop ------ ");
        for (Size value : sizes){
            System.out.println(value);
        }

    }
}
