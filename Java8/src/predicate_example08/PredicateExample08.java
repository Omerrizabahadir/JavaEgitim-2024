package predicate_example08;

import java.util.List;

public class PredicateExample08 {
    public static void main(String[] args) {
         /*
        SORU: List<Integer> ınız olsun,
        tek sayıları bulup list'e atıp ekrana yazsın.
         */

        List<Integer>numbers=List.of(3, 5, 10, 15, 9,90,12,24);
        List<Integer>listOfOddNumbers=numbers.stream()
                .filter(element -> element%2!=0)
                .toList();
        System.out.println("Listenin tek sayıları : ");
        listOfOddNumbers.forEach(System.out::println);
    }
}
