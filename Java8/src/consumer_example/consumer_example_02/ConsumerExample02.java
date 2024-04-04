package consumer_example.consumer_example_02;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample02 {
    public static void main(String[] args) {

        System.out.println("----");
        Consumer<Integer>c1= x -> System.out.println(x*2);

        // Stream.of çok kullanılmaz. aşağıda List olan Collection'lar çok kuullanılıyor
        System.out.println("Stream.of ");
        Stream.of(1,2,3).forEach(c1);


        System.out.println("Collection olan List.of");
        List.of(1,2,3).forEach(c1);



        System.out.println("----");
        //yazılışı farklı
        Consumer<Integer> c2= x -> System.out.println(x+3);
        List<Integer> numbers=List.of(1,2,3);
        numbers.stream().forEach(c2);


        System.out.println("----------");
        Consumer<Integer> c3= x -> System.out.println(x-3);
        Stream.of(1,2,3).forEach(c3);
        //Stream.of(1,2,3).forEach(x -> System.out.println(x-3));

        System.out.println("---------");
        Stream.of(1,2,3).forEach(System.out::println);
    }
}
