package stream_apı.teminal_operations.findAny_example;

import java.util.List;
import java.util.stream.Stream;

public class TerminalExample01 {
    public static void main(String[] args) {
        List.of("monkey", "gorilla", "bonobo")
                .stream()
                .findAny()
                .ifPresent(System.out::println);


        System.out.println("***********");

        /*
        yukardakinin farklı yazılışı
        Burada listeyi oluşturduk
        Stream.generate  ile ürettik
         */
        List<String>list1=List.of("monkey", "gorilla", "bonobo");
        Stream<String> infinitive=Stream.generate(()->"chimp");

        list1.stream()
                .findAny()
                .ifPresent(System.out::println);

        infinitive.findAny()
                .ifPresent(System.out::println);
    }
}

