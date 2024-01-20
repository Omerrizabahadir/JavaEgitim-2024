package for_example;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=scanner.nextInt();

        int ciftSayi=0;
        for (int i=sayi;i<10;i++){  //10'dan 1!e kadar çift kaç sayı var yazar
                                    // for(int i=sayi;i>1;i--) 1'den 10'a kadar kaç çift var yazar
            if (i%2==0){

                ciftSayi++;


            }

        }System.out.println(sayi+" den 10'a kadar "+ciftSayi);
    }
}
