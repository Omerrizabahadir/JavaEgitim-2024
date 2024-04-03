package stream_apı.intermediate_example_count;

import java.util.List;

public class IntermediateExample13 {
    public static void main(String[] args) {
        long count = List.of("k1", "k2", "k3")
                .stream()
                .count();  //bir Stream'deki öğelerin(element) sayısını belirler.


        System.out.println(count);
    }
}
