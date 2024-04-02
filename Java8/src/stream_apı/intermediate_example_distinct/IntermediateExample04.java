package stream_apı.intermediate_example_distinct;

import java.util.List;

public class IntermediateExample04 {
    /*
    distinct();  Listede Aynı değerden birden çok varsa bir tanesini al demek
     */
    public static void main(String[] args) {

        List.of("Hasan","java", "Kadir", "", "java", "Java")
                .stream()
                .distinct()  //önce java olanları bir tane alır
                .filter(e->!e.isEmpty())  //boş olanı filtreler
                .forEach(System.out::println); //terminal(sonuç)üretir


        System.out.println("*******************");


        List.of("Hasan","java", "Kadir", "", "java", "Java")
                .stream()
                .filter(e->e.startsWith("j")) //j ile başlayanları seçer.diğerlerini yazmaz
                .distinct()      //aynı olanlları eler
                .forEach(System.out::println); //sonucu basar. sadece 1 tane java çıktısı
    }
}
