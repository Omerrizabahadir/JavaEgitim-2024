package stream_apı.intermediate_example_filter_02;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class IntermediateExample03 {
    public static void main(String[] args) {
        List.of("Hasan", "Kadir", "", "Java")
                .stream()
                .filter(name->!name.isEmpty())
                .map(name->name.toLowerCase(Locale.ROOT))
                .forEach(System.out::println);
    }
}
