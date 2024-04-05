package parallel_stream_examples;

import java.util.Arrays;

public class ParallelStreamExample13 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList("w", "o", "l", "f")
                .stream()
                .reduce("x", String::concat));


        System.out.println(Arrays.asList("w", "o", "l", "f")
                .parallelStream()
                .reduce("x",String::concat));//parallelStream de hepsinin önüne x ekleyecek
    }
}
