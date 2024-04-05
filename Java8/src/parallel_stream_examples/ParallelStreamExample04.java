package parallel_stream_examples;

import com.sun.source.doctree.SeeTree;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamExample04 {
    public static void main(String[] args) {

        /*
        Set collection'sı zaten sıralama yapıyor
        parallel streamde yapasan set sıralayacaktır.burada parallel kullanmak doğru değil
         */

        Set<String> set1= Stream.of("w", "o", "l", "f", "a", "b", "c")
                .parallel()
                .collect(Collectors.toSet());
        System.out.println(set1);




    }
}
