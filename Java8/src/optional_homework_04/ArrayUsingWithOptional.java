package optional_homework_04;

import java.util.Optional;

public class ArrayUsingWithOptional {

    public static void main(String[] args) {
        String[] namesArray={null,"Ahmet","Mehmet","Ayşe","Fatma"};

        /*
        Koşuldan sonra ? konulur sonra koşul doğru ise dönecek cevabı yaz
        sonra  :  yanlış dönecek cevabı yaz
         */
        System.out.println("orElse()  kullanımı-------");
        System.out.println();
        String result1= Optional.ofNullable(namesArray)
                .map(array->array.length>0 ? array[0] : "Dizide olmayan isim")
                .orElse("Dizide olmayan isim");

        System.out.println("Name : "+result1);


        System.out.println("orElseGet() kullanımı-----------");
        System.out.println();

        String result2=Optional.ofNullable(namesArray)
                .map(array->array.length>1 ? array[1] : "Dizide olmayan isim")
                .orElseGet(()->"Dizide olmayan isim");

        System.out.println("Name : "+result2);







    }
}
