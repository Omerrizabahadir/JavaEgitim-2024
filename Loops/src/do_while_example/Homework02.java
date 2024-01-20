package do_while_example;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
//kullanıcıdan şifre iste 3 kere yanlış girerse kart bloke olsun

        Scanner scanner=new Scanner(System.in);
        String ad="bilge", sifre="123";
        int gHak=3;
        boolean devamEt =true;

       do {
           System.out.println("kullanıcı adı:");
           String kullaniciAdi=scanner.next();
           System.out.println("şifre:");
           String kullanicisifre=scanner.next();
           System.out.println(gHak+" . hakkınız ");

           if (kullaniciAdi.equals(ad)&&sifre.equals(kullanicisifre)){
               System.out.println("Hoşgeldiniz");
               devamEt=false;
           }else {
               gHak--;
               System.out.println("Kalan hakkın: "+gHak);
               if (gHak>0){
                  devamEt=true;
               }else {
                   System.out.println("kartınız bloke oldu");
                   devamEt=false;
               }
           }
       }while (devamEt);

    }
}
