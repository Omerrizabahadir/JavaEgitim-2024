package function_example.function_example_02;

import java.util.function.Function;

public class FunctionExample02 {
    public static void main(String[] args) {
        Function<String,Integer>f1=str->Integer.parseInt(str);
        //Function<String,Integer>f2=Integer::parseInt; üsttekinin kısası

        /*apply ile kullandık değeri dödürür.String "800" aldı
        işlem yaptı 800+100 Integer döndürür
         */
        System.out.println(f1.apply("800"));
       // System.out.println(f2.apply("800")+100);

        //burada ise sadece sting  800 'ün yanına  100 yazar
        System.out.println("800"+100);


        //Math.abs(); absolute (mutlak değer)alır
        Function<Integer,Integer>f3=str->Math.abs(str);
        //Function<Integer,Integer>f4=Math::abs; //üsttekinin aynısı daha kısa

        System.out.println("Mutlak değeri  : "+f3.apply(-400));



    }
}
