package method_homework;

import java.util.Scanner;

public class PerfectNumberWithMethod {
    public static void main(String[] args) {
        PerfectNumberWithMethod perfectNumberWithMethod = new PerfectNumberWithMethod();
        int num = 0;
        num = perfectNumberWithMethod.getNumberFromUser(num);
        num = perfectNumberWithMethod.findPerfectNumber(num);
    }

    public int getNumberFromUser(int number) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number :");
        number = scanner.nextInt();


        return number;
    }

    public int findPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum = sum + i;

            }
        }
        if (number == sum) {
            System.out.println("is a Perfrct number");
        } else {
            System.out.println("is not a perfect number");
        }

        return number;
    }
}