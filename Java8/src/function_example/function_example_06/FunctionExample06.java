package function_example.function_example_06;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionExample06 {
    public static void main(String[] args) {

        Function<String ,Integer> parseInt=Integer::parseInt;
        Function<Integer ,Integer> incrementExact=Math::incrementExact;//String'i Integer'a çevir,incrementExact;1 arttır

        /*yukardaki ikisini(Function interface'leri tek bir yerde birleştirip çağıracaz)birleştirecez.
        önce parseInt'i yap sonra increnentExact'i yap demek istersem
         */
        Function<String,Integer>parseIntAndIncrementExact=parseInt.andThen(incrementExact);
        Function<String ,Integer>compose=incrementExact.compose(parseInt);
        Stream.of("-3", "11", "25", "30", "-1", "-11")
                .map(parseIntAndIncrementExact)
                .forEach(System.out::println);




    }
}
