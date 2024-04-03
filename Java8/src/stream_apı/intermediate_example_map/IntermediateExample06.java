package stream_apı.intermediate_example_map;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateExample06 {
    public static void main(String[] args) {

        List.of("Hasan","Java", "Kadir", "", "Java", "JAva")
                .stream()
                .map(String::length)
                //.map(e->e.length())
                .forEach(System.out::println);

    }
}
