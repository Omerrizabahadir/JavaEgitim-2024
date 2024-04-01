package function_example_01;

import java.util.function.Function;

public class FunctionExample01 {
    public static void main(String[] args) {
        /*
        Function-->Functional Interface 'i örnekte String değer alıyor
        işlem yapıp.Integer değer döndürüyor
         */


        Function <String,Integer> lengthFunction1=e->e.length();
        //Function<String,Integer>lengthFunction2=(String e)->e.length(); üsttekinin aynısı
        int result1=lengthFunction1.apply("merhaba");
        System.out.println("Result 1 length is : "+result1);


        int result2=lengthFunction1.apply("hello World");
        System.out.println("Result 2 length is : "+result2);
        int result3=lengthFunction1.apply("functional Interface");
        System.out.println("Result 3 length is : "+result3);


    }

}
