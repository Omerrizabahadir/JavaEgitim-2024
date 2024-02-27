package claas_studies;

import java.util.Random;
import java.util.Scanner;

public class MukemmelSayıBul {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Mükemmel sayı bulma :");
        int number = random.nextInt(100);
        int sum = 0;

        System.out.println("Random " + number + " sayısının bölenleri :");
        for (int i = 1; i < number; i++) {
            sum += i;

            if (number % i == 0) {
                System.out.println(i);
            }
        }

        if (number == sum) {
            System.out.println(number + " sayısı mükemmel sayıdır");
        } else {
            System.out.println(number + " sayısı mükemmel sayı değildir");

        }
    }
}
