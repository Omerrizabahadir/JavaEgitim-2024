package predicate_example07;

import java.util.List;

public class PredicateExample07 {
    public static void main(String[] args) {
        /*
        SORU: Integer değerlerimiz olsun. List<Integer>
        daha sonrasında bu değerlerin 2 katı > 20 ise yeni bir List'e atsın ve daha sonra ekrana yazsın.
         */

        List<Integer> listOfNumbers = List.of(1, 2, 3, 5, 8, 13, 21);
        List<Integer>filteredList=listOfNumbers.stream()
                .filter(element ->element*2>=20)
                .toList();
        System.out.println("Listedeki tamsayı değerleri * 2 büyük veya eşit 20 ise : ");
        filteredList.forEach(System.out::println);
    }
}
