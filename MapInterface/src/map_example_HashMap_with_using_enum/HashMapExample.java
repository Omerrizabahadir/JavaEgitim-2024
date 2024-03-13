package map_example_HashMap_with_using_enum;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Size, Integer> sizes = new HashMap<>();
        //HashMap te sıralama enum'a göre olmaz. sıralama da yok
        sizes.put(Size.SMALL, 28);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.LARGE, 36);
        sizes.put(Size.EXTRALARGE, 40);

        System.out.println("Sizes : " + sizes);

    }
}
