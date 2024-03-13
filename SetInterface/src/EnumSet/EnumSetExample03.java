package EnumSet;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample03 {
    public static void main(String[] args) {
        //using of() with a single parameter

        Set<Size>sizes1= EnumSet.of(Size.MEDIUM);
        System.out.println("EnumSet  : "+sizes1);

        Set<Size>sizes2=EnumSet.of(Size.SMALL,Size.LARGE,Size.A);
        System.out.println("EnumSet2 : "+sizes2);
    }
}
