package parallel_stream_examples;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample01 {
    public static void main(String[] args) {

        /*
        stream() metodunda sırayla sayıları verecek
         */
        System.out.println("----------stream -> sıralı basar---------");
        List<Integer>listOfNumbers1=List.of(1,2,3,4,5,6);
        listOfNumbers1.stream()
                .forEach(n->System.out.print(n+" "));

        System.out.println("\n-------parallelStream -> sıra yoktur----------");

        /*
        parallelStream() de ise sıra her zaman değişecektir
         */
        List<Integer>listOfNumbers=List.of(1,2,3,4,5,6);
                listOfNumbers.parallelStream()
                .forEach(n->System.out.print(n+" "));




    }
}
