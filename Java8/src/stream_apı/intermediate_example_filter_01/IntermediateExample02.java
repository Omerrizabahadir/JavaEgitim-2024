package stream_apı.intermediate_example_filter_01;

import java.util.List;

public class IntermediateExample02 {
    public static void main(String[] args) {
        List.of(0,1,2,3,4,5,6,7,8,9)             //SOURCE
                .stream()
                .filter(i->(i%2==0))
                .map(i->i*3)
                .forEach(System.out::println);


        System.out.println("********************");


        List.of("bere","gem","dem","pim"," ")
                .stream()
                .filter(e->e.endsWith("m"))
                .map(e->e.contains("e"))
                .forEach(System.out::println);



    }
}
