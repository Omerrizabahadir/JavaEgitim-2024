package stream_apı.teminal_operations_TreeSet;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TerminalExample10 {
    public static void main(String[] args) {
        TreeSet<String> word= List.of("w", "o", "l", "f")
                .stream()
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(word);
    }
}
