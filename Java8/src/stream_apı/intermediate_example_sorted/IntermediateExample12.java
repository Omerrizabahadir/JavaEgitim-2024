package stream_apı.intermediate_example_sorted;

import java.util.stream.Stream;

public class IntermediateExample12 {
    public static void main(String[] args) {
       /*
       ilk önce limit sonra sort kullanmalısın

       sort sonra limit yaparsan sonsuz döngüye girer hata lı
        */


        Stream.generate(()->"Elsa")
                .filter(n->n.length()==4)
                .limit(3)
                .sorted()
                .forEach(System.out::println);


        Stream.generate(()->323)
                .limit(3)
                .sorted()
                .forEach(System.out::println);


    }
}
