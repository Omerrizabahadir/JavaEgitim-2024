package predicate_example04;

import java.util.List;

public class PredicateExample04 {
    public static void main(String[] args) {
        /*SORU: List<String> olsun
        bunun içinde String isimler olsun
        ve length'i  >4 olan
        ve baş harfi a olan string'leri filtreleyip ayrı bir List'e
        atıp onu da ekrana yazalım.
         */

        //listeleri biribirine bağlıyoruz
        List<String> listOfNanmes = List.of("necla", "yaren", "aslı", "veli", "aslihan", "karatas","asım");
        List<String> namesWithLength4 = listOfNanmes.stream()
                .filter(value -> value.length() > 4 && value.startsWith("a"))
                .toList();
        namesWithLength4.forEach(System.out::println);
        System.out.println("4 harften fazla ve a ile başlayan isimlerin listesi : " + namesWithLength4);
    }
}