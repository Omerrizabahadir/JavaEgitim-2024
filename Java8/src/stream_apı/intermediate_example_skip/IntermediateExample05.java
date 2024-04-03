package stream_apı.intermediate_example_skip;

import java.util.List;

public class IntermediateExample05 {
    public static void main(String[] args) {

        /*
        skip(n);---> n= kaç verirsen o sayı kadar atlar
         */
        List.of(0,1,2,3,4,5,6,7,8,9)
                .stream()
                .skip(3)   // 3 taneyi geç,atla devam et demek(0,1,2) yi atlar
                .limit(2)  //2 tane yazdırır.skip 0,1,2 yi atlar 3 ve 4 ü yazar
                .forEach(System.out::println);

        System.out.println("****************");

        List.of(0,1,2,3,4,5,6,7,8,9)
                .stream()
                .limit(5)    //5 tane yaz 0 ,1,2,3,4
                .skip(3)   //0,1,2 yi atlar. 3,4ü yazar
                .forEach(System.out::println);

    }
}
