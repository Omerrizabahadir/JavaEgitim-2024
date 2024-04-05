package parallel_stream_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParallelStreamExample03 {
    public static void main(String[] args) {
        List<Integer> data = Collections.synchronizedList(new ArrayList<>());

        System.out.println("---------forEchOrdered()-----------");

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).parallelStream()//parallelStream var ama sora forEachOrdered kullandığı için sıralı basar
                .map(i -> {   //i = listenin elemanları
                    data.add(i);
                    return i;
                }).forEachOrdered(i -> System.out.print(i + " "));//.forEachOrdered listedeki elemanlar sırayla verir

        System.out.println();
        System.out.println(data + "\t");//parallelStream ile data karışık verecek


        System.out.println("-----------forEach()----------");


        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).parallelStream()
                .map(i -> {   //i = listenin elemanları
                    data.add(i);
                    return i;
                }).forEach(i -> System.out.print(i + " "));//parallelStream ve forEach kullandı sıra değişir
    }

}
