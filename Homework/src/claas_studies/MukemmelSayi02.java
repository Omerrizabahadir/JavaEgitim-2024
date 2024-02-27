package claas_studies;

import java.util.Scanner;

public class MukemmelSayi02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mükemmel sayı buluyoruz.Çıkmak için 0'a basınız");
        int number;

        while (true) {
            System.out.println("sayı giriniz");
            number = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i < number; i++) {

                if (number % i == 0) {

                    sum += i;
                    System.out.println(i);

                }

            }
            if (sum == number) {
                System.out.println(number + " mükemmel sayı");
            } else {
                System.out.println(number + " mükemmel sayı değil");

            }
            if (number == 0) {
                System.out.println("0'a bastınız program kapatılıyor");
                break;
            }

        }

    }
}
