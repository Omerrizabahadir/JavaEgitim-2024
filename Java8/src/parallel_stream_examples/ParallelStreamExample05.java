package parallel_stream_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParallelStreamExample05 {
    public static void main(String[] args) {


        System.out.println("--------list without synchronized----------");
        List<Integer> data = new ArrayList<>();
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
                .parallelStream()
                .map(i -> {
                    data.add(i);
                    return i;
                }).forEachOrdered(i -> System.out.print(i + " "));
        System.out.println();
        System.out.print(data); //data deyip listeyi çekersek forEachOrdered old.için sıralı verecek
        System.out.print(data.size()); //basılınca değer kaybı olur.kaybolan kaç tane ise  [] arrayin  dışında eleman sayısından az verecektir.

        System.out.println();
        System.out.println("\n--------list with synchronizedList----------");
        List<Integer> synchronizedData = Collections.synchronizedList(new ArrayList<>());
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
                .parallelStream()
                .map(i -> {
                    data.add(i);
                    return i;
                }).forEachOrdered(i -> System.out.print(i + " "));
        System.out.println();
        System.out.print(synchronizedData); //data deyip listeyi çekersek forEachOrdered old.için sıralı verecek
        System.out.print(synchronizedData.size()); //size ile basılınca değer kaybı olur.kaybolan kaç tane ise  [] arrayin  dışında eleman sayısından az verecektir.

    }
}
