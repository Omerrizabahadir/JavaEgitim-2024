package claas_studies;

import java.util.Scanner;

public class MukemmelSayilar01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mükemmel sayıyı buluyoruz!. Proğramdan çıkış için 0'a basınız");

        while (true) {
            System.out.println("sayı giriniz :");
            int number = scanner.nextInt();

            int sum = 0;

            System.out.println(number+ " sayısının bölenleri :");
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum = sum+i;
                    System.out.println(i);
                }
            }
            if (sum == number) {
                System.out.println("ve "+number + " sayısı mükemmel sayıdır");
            } else {
                System.out.println("ve "+number+" sayısı mükemmel sayı değildir");

            }
            if (number==0){
                System.out.println("Proğram kapatılıyor");
                break;
            }
        }
    }
}
