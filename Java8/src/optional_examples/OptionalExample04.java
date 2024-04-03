package optional_examples;

import java.util.Optional;

public class OptionalExample04 {
    public static void main(String[] args) {

        /*
        Optional bir nesneye sahip olduğumuzda, içinde bir değer olup olmadığını
        isPresent() yöntemiyle kontrol edebiliriz:
         */

        Optional<String>string=Optional.ofNullable("      abracadabra      ");
        if (string.isPresent()){
            string.map(String::trim)  //trim yanlardaki boşlukları kapatır
                    .ifPresent(System.out::println);
        }
        string.map(String::trim).ifPresent(System.out::println);//maple, trim boşluğu kapat ve değer varsa getir
    }
}
