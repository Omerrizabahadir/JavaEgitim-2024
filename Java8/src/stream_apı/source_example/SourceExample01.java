package stream_apı.source_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SourceExample01 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 34, 56, 0);  //SOURCE
        list.stream().map(n -> n + 2).toList().forEach(System.out::println);



        System.out.println("***********************");



        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);//SOURCE
        System.out.println(numbers.stream().map(e -> e * 2).toList());



        System.out.println("***********************");

        IntStream.rangeClosed(1, 10).forEach(System.out::println);  //IntStream.rangeClosed(1, 10) SOURCE


        System.out.println("***********************");

        IntStream.rangeClosed(1, 10).map(e -> e * 2).forEach(System.out::println);  //IntStream.rangeClosed(1, 10) SOURCE


    }
}
