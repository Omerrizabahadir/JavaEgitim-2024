package optional_examples;

import java.util.Optional;

public class OptionalExample05 {
    public static void main(String[] args) {
        Optional<String> string=Optional.ofNullable(null);

        System.out.println(string.map(String::length).orElse(-1));//maple, string.length ini getir null ise -1 döndür

        System.out.println(string.map(String::length).orElseGet(()->defaultMessage()));
        System.out.println(string.map(String::length).orElseThrow(InternalError::new));//maple,string length'i getir,veya hata fırlat
    }
    public static Integer defaultMessage(){

        return -5;
    }
    public static Integer defaultMessage(int value){

        return -10;
    }
}
