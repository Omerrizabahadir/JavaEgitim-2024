package predicate_example06;

import java.util.List;

public class PredicateExample06 {
    public static void main(String[] args) {
 /*
    SORU: elinizde List<String> isimler olsun,
    daha sonra filter kullanarak bu isimlerin length'i >=3, <=5 ve son harfi 'a' olanları filtreleyip
    Yeni bir list'e atıp daha sonra ekrana yazdırınız.
     */

        List<String> listOfNames = List.of("Ferit", "Luna", "Merta", "Ana", "Lea", "Alaaddin", "Ada", "Emma");
        List<String> filteredList = listOfNames.stream()
                .filter(element -> element.endsWith("a") && element.length() >= 3 && element.length() <= 5)
                .toList();
        System.out.println("a ile biten ve  uzunluğu >=3  ve  <=5  olan isimler : ");
                filteredList.forEach(System.out::println);

    }
}
