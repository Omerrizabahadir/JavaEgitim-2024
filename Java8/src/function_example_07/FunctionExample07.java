package function_example_07;

import java.util.List;
import java.util.function.Function;

public class FunctionExample07 {
    public static void main(String[] args) {
        //listede verilenleri Büyük yaz
        List<String> list1 = List.of("a a", "b b", "c c", "d d");
        //uzun yazılışı
        System.out.println("uzun hali :");
        Function<String, String> upperCase = String::toUpperCase;
        list1.stream().map(upperCase).forEach(System.out::println);




        //aynı listedekileri daha kısa şekilde yazdıracaz.Burada Function<> yazmana gerek yok.replace() yanyana yaz demek
        System.out.println("kısa yazılışı :");
        list1.stream().map(String::toUpperCase).map(e -> e.replace(" ", "")).forEach(System.out::println);

    }
}
