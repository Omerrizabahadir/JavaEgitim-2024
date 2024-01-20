package while_example;

import java.util.Scanner;

public class WhileLoop04 {
    public static void main(String[] args) {
        //kullanıcı şifreyi 3 kere yanlış girerse şifre bloke olsun
        Scanner scanner=new Scanner(System.in);
String kullaniciAdi="ömer";
String sifre="1234";
int gHak=3;

     while (gHak>0){
         System.out.println("Lütfen Kullanıcı Adınızı girin:");
         kullaniciAdi=scanner.next();
         System.out.println("Şifrenizi girin");
         sifre=scanner.next();

         if(kullaniciAdi.equals("Ömer")&& sifre.equals("1234")) {
             System.out.println("HOŞGELDİNİZ Ömer Bey");
             break;
         } else
             gHak--;
         System.out.println("Kalan hakkınız:"+gHak);



         }

        System.out.println("kart bloke olmuştur");

     }

    }





