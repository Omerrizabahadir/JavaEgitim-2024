package method_homework;

import java.util.Random;
import java.util.Scanner;

public class DiceWithMethods02 {
    public static void main(String[] args) {
        DiceWithMethods02 diceWithMethods02 = new DiceWithMethods02();

        int userGuessNumber = diceWithMethods02.getNumber();
        int sayac = diceWithMethods02.matchGenerateDiceWithNumber(userGuessNumber);

    }

    public int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("4-24 arasında bir sayı giriniz");
        int number = scanner.nextInt();

        return number;
    }

    public int matchGenerateDiceWithNumber(int userGuessNumber) {
        Random random = new Random();

        int sayac = 0;
        while (true) {
            int randomDiceNumber1 = random.nextInt(6) + 1;
            int randomDiceNumber2 = random.nextInt(6) + 1;
            sayac++;
           int result = (randomDiceNumber1 + randomDiceNumber2) * 2;
            if (userGuessNumber==result) {
                if (sayac <= 2) {
                    System.out.println("3 milyon dolar kazandınız");
                } else if (sayac > 2 && sayac <= 6) {
                    System.out.println("1 milyon dolar kazandınız");

                } else if (sayac > 7 && sayac <= 10) {
                    System.out.println("500 bin dolar kazandınız");

                } else {
                    System.out.println("50 dolar kazandınız");
                    }
                break;
                }
            if (result%2!=0){
                System.out.println("50 dolar kazandınız");
                break;
            }



    }


        return sayac;
    }
}


