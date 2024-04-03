package stream_apı.intermediate_example_sorted;

import java.util.List;

public class IntermediateExample11 {
    public static void main(String[] args) {
        List.of("brown-", "bear-", "bee-")
                .stream()
                .sorted()   //alfabetik sıralıyor
                .forEach(System.out::println);


        System.out.println("******************");


        List.of(100,23,24,17,45)
                .stream()
                .sorted()   //sayıları sıralaıyor
                .forEach(System.out::println);
    }
}
