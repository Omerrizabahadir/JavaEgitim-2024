package begin_with_java_questions_tekrar;

import java.util.Scanner;

public class LargeSmallNumber {

    /*
    Write a program to enter the numbers till the user wants
    and at the end the program should display the largest
    and smallest numbers entered.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sayac = 0;
        int maxValue=0;
        int minValue=0;
        System.out.println("Hangisi en büyük,Hangisi en küçük?");

        char choice = 0;
        do {

            System.out.println("sayı giriniz");
            number = scanner.nextInt();
            sayac++;

            if (number > maxValue) {
                maxValue = number;

            }
            if (number < minValue) {
                minValue = number;

            }
            System.out.println("Devam etömek istiyor musunuz? (y/n)");
            choice = scanner.next().charAt(0);

        } while (choice == 'y');
        System.out.println("En büyük sayı :" + maxValue);
        System.out.println("En küçük sayı :" + minValue);
    }
}
