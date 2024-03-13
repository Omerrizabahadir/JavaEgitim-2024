package map_example_EnumMapExample_02;

import java.util.EnumMap;

public class EnumMapExample02 {
    public static void main(String[] args) {

        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);

        //Add key-value . Enum da ORDIANAL sırasına göre tutulur key ler.
        //Yani Enum sırası neyse ona göre sıralayacak
        sizes.put(Size.LARGE, 36);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.SMALL, 28);
        sizes.put(Size.EXTRALARGE, 40);
        sizes.put(Size.DIFFERENTOPTIONS,12);

        //Size.EXTRALARGE.ordinal();  Ordinal olarak tutar sıralamayı. Yani Enumdaki sıralamayı tutar.
        System.out.println("EnumMap : " + sizes);

        //remove () method
        int value = sizes.remove(Size.MEDIUM);
        System.out.println(value);

        System.out.println("Remove sonrası :" + sizes);

        //remove () metodu ile boolean kontrol
        boolean result = sizes.remove(Size.SMALL, 28);
        System.out.println("SMALL Key'i kaldırıldı mı? :" + result);

        System.out.println("Boolean kontrol sonrası : " + sizes);

    }
}
