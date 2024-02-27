package method_homework;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberWithMethods03 {
    /*
   1-)Kullanıcıdan tahmini bir sayı isteyiniz. 1 ile 100 (1 ve 100 dahil) arasında  -->method ile
   (Yani main metodumuz kullanıcıdan sayı alsın ve geri dönsün).
   2-)1- 100 arasında tek tek random sayı üretiniz.Eğer ilk denemede kullanıcının verdiği değer üretilirse
   kullanıcı 100 Milyon dolar kazansın.
   Eğer 20. denemede değer üretilirse 5 milyon dolar kazansın.
   30-50 arasında 1 milyon dolar kazansın.
   50 denemeden daha sonra ise üzgünüm hiç bir şey kazanamadınız desin.
   En az iki metod ile yap.
   mesaj vereceği metod void olsun
    */
    public static void main(String[] args) {
        RandomNumberWithMethods03 randomNumberWithMethods03 = new RandomNumberWithMethods03();

        int userGuessNumber = randomNumberWithMethods03.getNumberFromUser();

        int sayac = randomNumberWithMethods03.matchNumberWithGuessNumber(userGuessNumber);
        randomNumberWithMethods03.calculateMoneyForWinner(sayac);

    }

    public int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("1 ile 100 arasında sayı giriniz :");
        number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            if (number <= 0 || number > 100) {
                System.out.println("Sayı 1 ile 100 arasında olmalı tekrar sayı giriniz");
                number = scanner.nextInt();
            }
        }
        return number;
    }

    public int matchNumberWithGuessNumber(int userGuessNumber) {
        Random random = new Random();
        int randomNumberFromUser;
        int sayac = 0;

        while (true) {
            randomNumberFromUser = random.nextInt(100) + 1;
            sayac++;
            if (randomNumberFromUser == userGuessNumber) {
                break;
            }
        }
        return userGuessNumber;
    }

    public void calculateMoneyForWinner(int sayac) {
        if (sayac == 1) {
            System.out.println("Tebrikler 100 Milyon dolar kazandınız!");

        } else if (sayac > 1 && sayac <= 30) {
            System.out.println("Tebrikler 5 Milyon dolar kazandınız!");

        } else if (sayac > 30 && sayac >= 50) {
            System.out.println("Tebrikler 1 Milyon dolar kazandınız!");

        } else {
            System.out.println("50 dolar kazndınız");

        }
    }

}