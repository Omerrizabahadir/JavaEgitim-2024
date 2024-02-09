package begin_with_java_questions_tekrar;

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        /*
        Write a program to calculate the sum of following series where n is input by user.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
         */

        Scanner scanner = new Scanner(System.in);

        int number;
        double sum = 0;
        System.out.println("kaç tane terim olsun");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            sum += 1.0 / i;


        }
        System.out.println("Toplam :"+sum);

    }
}