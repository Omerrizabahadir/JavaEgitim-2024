package parallel_stream_examples;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamExample07 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("lions", "tigers", "bears", "pumas","chitas")
                .parallel();

        ConcurrentMap<Integer, List<String>> map = stream.collect(Collectors.groupingByConcurrent(String::length));
        System.out.println(map);


/*
groupingByConcurrent() ->kullanarak uzunluğu aynı olanları gruplayacak
 */

    }
}
