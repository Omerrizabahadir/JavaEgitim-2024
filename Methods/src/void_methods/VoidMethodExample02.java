package void_methods;

import java.util.Scanner;

public class VoidMethodExample02 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("isim giriniz:");
        String name=scanner.next();
        //String name=sayHello1();   bunu void bir şey döndürmeyeceğinden hata verir
        //parametreli void metod birşey döndürmez çağıramazsın ancak parametre yazılabilir
        sayHello2(name); // buda boş döneceği için Strin name=scanner.next(); diyemezsin
        String soyad=scanner.next();    //methodum String döndürdüğü için burada String ile döndürebildim(çağırabildim)
        System.out.println("soyadınızı girin:");
        soyad=sayHello3(soyad);

    }
    public static void sayHello1(){

       // System.out.println(name);
         /* burada name değişkeni kullanamam
         ne yapmalıyım --->  parametrik method olmalı
          */

    }
    //parametreli void method

    public static void sayHello2(String ad){    //dışardan bir değer alacağım için parametreyle belirttik
        System.out.println("merhaba "+ad);
    }
    public static String sayHello3(String surName){
        System.out.println(surName+" teşekkürler");
        return surName;

    }

}
