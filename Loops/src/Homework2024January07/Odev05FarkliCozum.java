package Homework2024January07;

import java.util.Scanner;

public class Odev05FarkliCozum {

    ////.Kullanıcıdan alınan bir pozitif sayının çift veya tek olduğunu belirleyen
    //        // bir if-else ifadesi içeren bir for döngüsü yazın.
    public static void main(String[] args) {


       /* for (int i = 1; i < 100; i++) {
            String number = (i % 2 == 0) ? i + "Even number" : i + " Odd number";
            System.out.println(number);


        }
*/
       //farklı yol

        Scanner scanner=new Scanner(System.in);
        int istenenSayi,number1,sayac1=0,sayac2=0;
        System.out.println("Kaç sayı istiyorsunuz :");
        istenenSayi=scanner.nextInt();

        for (int i=1;i<=istenenSayi;i++){
            System.out.println("Kontrol etmek istediğiniz sayıyı giriniz :");
            number1=scanner.nextInt();

            if(number1%2==0){
                System.out.println("Sayınız çifttir");
                sayac1++;
            }else {
                System.out.println("Sayınız tektir");
                sayac2++;
            }
        }
        System.out.println("Toplam "+sayac2+" sayı kadar tek sayı"+"Toplam"+sayac1+" sayı kadar çift sayı");
    }
}
