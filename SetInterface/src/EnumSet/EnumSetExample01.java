package EnumSet;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample01 {
    public static void main(String[] args) {

        //EnumMap te oluştururken böyle olmalı
        //Map<Size, Integer> sizes =new EnumMap<>(Size.class);

        //EnumSet te ise bu şekilde olmalı
        Set<Size> sizes1 = EnumSet.of(Size.SMALL);
        sizes1.add(Size.SMALL);
        sizes1.add(Size.SMALL);
        System.out.println("EnumSet Add only one member (Small) : "+sizes1);

        Set<Size> sizes2 =EnumSet.allOf(Size.class);
        sizes2.add(Size.A);
        sizes2.add(Size.A);
        sizes2.add(Size.EXTRALARGE);
        sizes2.add(Size.EXTRALARGE);
        System.out.println("EnumSet add all enum members : "+sizes2);

        //creating EnumSet using noneOf() method
        Set<Size> sizes3= EnumSet.noneOf(Size.class);
        System.out.println(sizes3);
        sizes3.add(Size.MEDIUM);
        System.out.println(sizes3);

    }
}
