package Homework2024January07;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        //.Kullanıcıdan alınan bir pozitif sayının çift veya tek olduğunu belirleyen
        // bir if-else ifadesi içeren bir for döngüsü yazın.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int kSayi=scanner.nextInt();

      for (int i=2;i<=kSayi;i++){
          Boolean ciftSayi=true,tekSayi=true;
          ciftSayi=kSayi%2==0;
          tekSayi=kSayi%2!=0;

          if (ciftSayi){

              System.out.println(kSayi+" sayısı Çifttir");
          }else  {
              System.out.println(kSayi+" sayısı Tektir");

          }
         break;
      }

    }
}
