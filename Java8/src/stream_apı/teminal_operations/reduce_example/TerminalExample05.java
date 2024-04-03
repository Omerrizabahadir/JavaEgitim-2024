package stream_apı.teminal_operations.reduce_example;

import java.util.List;
import java.util.Optional;

public class TerminalExample05 {
    public static void main(String[] args) {
        List<Integer> list1= List.of(3,5,6);
        List<Integer> list2= List.of(3,5,6);


        Integer result=list1.stream()
                .reduce(10,(a,b)->a*b);//reduce listedeki tüm sayıları alıp çarp dedi çarpar.sorada 10 verilmiş 10 ile çarpar
        System.out.println(result);

        Optional<Integer>result2=list2.stream()
                .reduce((a,b)->a*b);

        result2.ifPresent(System.out::println);


        //reduce(Integer::sum) ile  reduce((a,b)->a+b)  aynı şey
        System.out.println(list1.stream().reduce(Integer::sum));
        System.out.println(list1.stream().reduce((a,b)->a+b));
    }
}
