package predicate.predicate_example01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample01 {
    public static void main(String[] args) {


        /*3'üde aynı şeyi yazar.
        valeu veya element kullanabilirsin

        element(value) tipi belirtilebilir.(String element)->. ama belirtmek zorunda değiliz
        {}-> blok içinded de yazabilirsin
         */
        Predicate<String> predicate1 = value -> value.startsWith("h");

        Predicate<String> predicate2 = (String element) -> element.startsWith("h");
        //Predicate<String> predicate2 = (String value) -> value.startsWith("h");

        Predicate<String> predicate3 = (String element) -> {
            return element.startsWith("h");
        };

        /*
        Bu Predicate'ler stream ile çalışır.
         */

        System.out.println("stream.of çıktısı : ");
        Stream.of("Java8", "hasan", "kadir", "demircan", "hello").filter(predicate1)
                .forEach(System.out::println);

        /*
        ya da bir liste oluştur.o listeyi yine stream.filter(predicate1).toList(); ile yeni listeye h ile başlayanları at
         */

        //names listesi isimlerle oluşturulmuş
        System.out.println("Liste ve içinde stream kullanarak : ");
        List<String> names= Arrays.asList("Java8", "hasan", "kadir", "demircan", "hello");
        //stream().filter(predicate1).toList(); ile namesStartsWithH listesi oluşturduk. içine attık
        List<String>namesStartsWithH1=names.stream().filter(predicate1).toList();  //java16 daki yenilik

        //java 8 deki kullanım
        List<String>namesStartsWithH2=names.stream().filter(predicate1).collect(Collectors.toList());
        System.out.println("Array of Names start with h  java 16 yazımı : "+namesStartsWithH1);
        System.out.println("Array of Names start with h java 8 yazımı : "+namesStartsWithH2);


    }
}
