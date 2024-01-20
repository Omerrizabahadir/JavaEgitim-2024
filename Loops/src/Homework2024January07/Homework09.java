package Homework2024January07;

import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bir sayının asal çarpanlarını bulan
        // bir do-while döngüsü içeren bir Java programı nasıl yazılır?
        //6 nın asal çarpanları 2*2*3 tür

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int kSayisi = scanner.nextInt();
        int bolen=0;
        int sayac = 2;
        boolean asalCarpanMi = true;

        System.out.println(kSayisi + " sayısınının asal çarpanları:");
        do {

           while (kSayisi%sayac==0){
               System.out.println("bolen:"+sayac);
               kSayisi/=sayac;
            }
            sayac++;
        } while (sayac<=kSayisi);


    }
}