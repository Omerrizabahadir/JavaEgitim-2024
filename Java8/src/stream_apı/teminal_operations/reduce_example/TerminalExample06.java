package stream_apı.teminal_operations.reduce_example;

import java.util.List;
import java.util.Optional;

public class TerminalExample06 {
    public static void main(String[] args) {
        List<String> list1 = List.of("w1", "o2", "l3", "f4");
        String text = list1.stream()
                .reduce("x", (a, b) -> a + b);  //  listedekileri birleştirip önüne x koyar
        System.out.println(text);


        Optional<String>text2=list1.stream()
                .reduce((a,b)->a+b);
        text2.ifPresent(System.out::println);

    }
}
