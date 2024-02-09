package begin_with_java_questions_tekrar;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is
         a prime number.
        Kullanıcıdan pozitif bir tamsayı girmesini isteyen bir program yazınız.
         Daha sonra sayının asal sayı olup olmadığını belirten bir mesaj vermelidir.
         */

        Scanner scanner = new Scanner(System.in);
        int num;
        boolean isPrime = true;


        while (true) {

            System.out.println("Enter positive integer");
            System.out.println("if you want to exit, enter a negative number ");
            num = scanner.nextInt();

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;

                }
            }

            if (isPrime && num > 1) {
                System.out.println("Your number is prime");
            } else {
                System.out.println("Your number is not  prime");
            }
            if (num < 0) {
                System.out.println("Program is closing");
                break;
            }
        }

    }

}


