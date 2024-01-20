package Homework2024January07;

import java.util.Scanner;

public class Homework05OtherWay {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int kGirisi1,num1,sayac1=0,sayac2=0;
        System.out.println("Kaç sayı kontrol etmek istiyorsunuz ");
        kGirisi1=scanner.nextInt();


        for (int i=1;i<=kGirisi1;i++){
            System.out.println("kontrol etmek istediğiniz sayıyı giriniz:");
           num1=scanner.nextInt();

           if (num1%2==0){
               System.out.println("sayı çifttir");
               sayac1++;

           }else {
               System.out.println("sayı tektir");
               sayac2++;
           }

        }
        System.out.println("Toplam "+sayac1+" kadar çift sayınız vardır"+"\n"+"Toplam "+sayac2+" kadar tek sayınız vardır  ");
    }

    }