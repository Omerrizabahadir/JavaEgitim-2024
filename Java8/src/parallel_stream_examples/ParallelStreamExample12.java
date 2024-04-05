package parallel_stream_examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParallelStreamExample12 {
    public static void main(String[] args) {
        System.out.println("--------------stream()------------");
        System.out.println( Arrays.asList(1,2,3,4,5,6)
                .stream()//0-1=-1,  -1-2=-3,  -3-3=-6,  -6-4=-10,  -10-5=-15,  -15-6=-21   -->çıkar sonuç
                .reduce(0,(a,b)->(a-b)));//dizideki elemanları birbirinden çıkaracak

        System.out.println("--------parallelStream()------------");
        System.out.println( Arrays.asList(1,2,3,4,5,6)
                .parallelStream() //sıralama değiştiği için sonuç farklı olacaktır
                .reduce(0,(a,b)->(a-b)));


    }
}
