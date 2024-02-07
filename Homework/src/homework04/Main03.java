package homework04;

import java.util.Arrays;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {


         /*
        /*Taking numbers from users and adding numbers to the array
        kullanıcıdan kaç adet sayı gireceğini al ve sayı girdirt ve sonra bunları diziye ata
        sonra bu sayıların ortalamasını,toplamını, tek çift değerlerini yazan program
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz :");
        int userNumber1 = scanner.nextInt();
        int[] userNumbersArray = new int[userNumber1];
        int sayac = 0;
        int top = 0;
        int ort = 0;
        int sayac2 = 0, sayac3 = 0;

        while (sayac < userNumber1) {
            System.out.println((sayac + 1) + ". sayıyı giriniz :");
            int userNumber2 = scanner.nextInt();
            userNumbersArray[sayac] = userNumber2;
            top = top + userNumber2;
            sayac++;

           //while döngüsünden çıkmayıda sağlar
            if (userNumber2 % 2 == 0) {
                System.out.println(userNumber2 + " çift");
                sayac2++;

            } else {
                System.out.println(userNumber2 + " tek");
                sayac3++;

            }

        }
        System.out.println(Arrays.toString(userNumbersArray));
        System.out.println("Dizinin sayıları toplamı : " + top);
        System.out.println("Dizideki sayıların ortalaması : " + (double) top / userNumber1);
        System.out.println("Girdiğiniz "+sayac2 + " adet sayı çift");
        System.out.println("Girdiğiniz "+sayac3 + " adet sayı tek");

    }

}
