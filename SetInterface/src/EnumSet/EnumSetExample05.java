package EnumSet;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample05 {
    public static void main(String[] args) {

        // Creating EnumSet using allOf()
        Set<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("EnumSet : " + sizes);

        // Using remove()
        boolean result = sizes.remove(Size.MEDIUM);
        System.out.println("Is MEDIUM removed : " + result);
        System.out.println("After the remove MEDIUM, EnumSet list is : " + sizes);

        //using removeAll()
        boolean result1 = sizes.removeAll(sizes);
        System.out.println("Are all sizes element removed : " + result1);
        System.out.println("After the removedAll metod Enum list is : " + sizes);

    }
}
