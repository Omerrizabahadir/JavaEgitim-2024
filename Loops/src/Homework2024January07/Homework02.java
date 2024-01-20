package Homework2024January07;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bir pozitif tam sayının faktöriyelini hesaplayan bir while döngüsü yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen faktöryel hesaplamak için bir sayı giriniz!!!");
        int kSayisi = scanner.nextInt();
        int sayac = 0;
        int faktoryel = 1;
        boolean sifirIse = false;

        while (sayac < kSayisi) {
            sayac++;
            faktoryel *= sayac;
        }
        System.out.println(sayac + " sayısının faktöryeli " + faktoryel);
    }
}