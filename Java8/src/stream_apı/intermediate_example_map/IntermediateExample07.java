package stream_apı.intermediate_example_map;

import java.util.List;

public class IntermediateExample07 {
    public static void main(String[] args) {
        List<Integer>numberList= List.of("1","2", "3", "4", "5", "6")
                .stream()
                .map(Integer::valueOf)//Integer'a çevirir
                .filter(e->e%2==0)       //çift olanları al
                .map(e->e*e) //karelerini al
                .filter(e->e>15)//15'ten büyük olanları al
                .toList();    //listele

        numberList.forEach(System.out::println);
    }
}
