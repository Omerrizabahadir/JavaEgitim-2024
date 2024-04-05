package parallel_stream_examples;

import java.util.List;

public class ParallelStreamExample02 {
    public static void main(String[] args) {

        System.out.println("-----with parallelStream() method------");
        List.of("jackal", "kangroo", "lemur")
                .parallelStream()
                .map(e -> {
                    return e;
                }).forEach(System.out::println);

        /*
        stream() il eyapsaydık
        sırayla vercekti
         */

        System.out.println("-----with stream() method----- ");
        List.of("jackal", "kangroo", "lemur")
                .stream()
                .map(e -> {

                    return e;
                }).forEach(System.out::println);

    }
}
