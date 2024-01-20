package Homework2024January07;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı girişi alan ve bu sayının
        // asal olup olmadığını kontrol eden bir do-while döngüsü ile

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz!!");
        int number = scanner.nextInt();
        int sayac = 2;
        boolean asalMi = true;

        do {

            if (number % sayac == 0 && sayac != number) {
                asalMi=false;

            }
            sayac++;

        } while (sayac<number);

        if(asalMi) {
            System.out.println("Girdiğiniz sayı " + number + " asaldır");
        }else {
            System.out.println("Girdiğiniz sayı " + number + " asal değildir");
        }
    }
}
