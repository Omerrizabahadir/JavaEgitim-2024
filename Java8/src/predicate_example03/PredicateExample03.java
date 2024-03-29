package predicate_examples03;

import javax.sql.rowset.Predicate;
import java.util.List;

public class PredicateExample03 {
    public static void main(String[] args) {

        /*SORU: bir tane List Integer oluşturunuz,
         bu List integer içerisinde 5-10 tane number olsun,bu number'lar negatif ve pozitif olsun.
         daha sonra java8 stream predicate'i kullanarak pozitif olanları bir yeni List'e atınız
         daha sonra bunları ekrana basınız.

         */

        List<Integer> numbers = List.of(1, -2, 3, 4, 5, -8, 9, -12, 15, -18);
        List<Integer> positiveNumbers = numbers.stream()
                .filter(element ->element>0)
                .toList();
        System.out.println("pozitive numbers are :");
        positiveNumbers.forEach(System.out::println);
    }
}
