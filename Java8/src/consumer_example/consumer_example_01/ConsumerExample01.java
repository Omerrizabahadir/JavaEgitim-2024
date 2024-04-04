package consumer_example.consumer_example_01;

import java.util.function.Consumer;

public class ConsumerExample01 {
    public static void main(String[] args) {
        //Değer alıp, değer döndürmüyorsa bu consumer'dır. Örneğin, System.out.println

        Consumer<String> printUpperCase= value -> System.out.println(value.toUpperCase());
        printUpperCase.accept("merhaba");


        //accept(10); 10 'u x kabul et işlemi yap
        //Consumer olan yer System.out.println 'dur. çarpma işlemi Consumer değil değer döndürdüğü için
        Consumer<Integer> c1= x -> System.out.println(x*2);

        c1.accept(10);



    }
}
