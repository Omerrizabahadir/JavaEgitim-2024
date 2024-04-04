package function_example.function_example_09;

import java.util.function.Function;

public class FunctionExample09 {
    public static void main(String[] args) {

        Function<String ,Integer>calculateLength=String::length;//Girilen String text in uzunluğu =16
        Function<Integer,Integer>square=number->number*number; //çıktı alınacak Integer değeri kendisi ile çarp

        //iki Function'ı birleştirecez
        Function<String,Integer>combineCalculateLenngthAndSquare=calculateLength.andThen(square);

        String text="Java Programming";  //uzunluğu 16
        int result=combineCalculateLenngthAndSquare.apply(text);
        System.out.println("result : "+result);

    }
}
