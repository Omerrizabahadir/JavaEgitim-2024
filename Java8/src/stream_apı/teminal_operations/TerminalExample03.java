package stream_apı.teminal_operations;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TerminalExample03 {
    public static void main(String[] args) {

        List<String>list=List.of("monkey", "2", "chimp");
        Stream<String>infinitive= Stream.generate(()->"chimp");
        Stream<String>infinitive2=Stream.generate(()->"chimp");


        Predicate<String>predicate=x->Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(predicate));
        System.out.println(list.stream().allMatch(predicate));
        System.out.println(list.stream().noneMatch(predicate));

        System.out.println("*********************");
        System.out.println(infinitive.anyMatch(predicate));
        System.out.println(infinitive2.noneMatch(predicate));
    }
}
