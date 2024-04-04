package function_example.function_example_05;

import java.util.function.Function;

public class FunctionExample05 {
    public static void main(String[] args) {

        /*
         //function ile bir sayıyı alsın 2 ile çarpıp 10 ile toplasın
         ve dönsün ekrana bas.
         */
        Function<Integer,Integer>f1=number->(number*2)+10;
        System.out.println("(20*2)+10 : "+f1.apply(20));

    }
}
