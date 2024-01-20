package Homework2024January07;

import java.util.Scanner;

public class Odev09DigerYol {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bir sayının asal çarpanlarını bulan
        // bir do-while döngüsü içeren bir Java programı nasıl yazılır?

        Scanner scanner = new Scanner(System.in);
        int kGirisi, i = 0;
        System.out.println("sayınızı girin:");
        kGirisi = scanner.nextInt();

        System.out.println("girdiğiniz sayının asal çarpanları");

        do {

            i++;
            if (kGirisi % i == 0) {
                System.out.print("\t "+i);
            }

        } while (i >= 0);

    }
}
