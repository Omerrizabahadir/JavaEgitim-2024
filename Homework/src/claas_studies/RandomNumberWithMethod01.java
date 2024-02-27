package claas_studies;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberWithMethod01 {
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
        RandomNumberWithMethod01 randomNumberWithMethod01 = new RandomNumberWithMethod01();
        int userGuessNumber = randomNumberWithMethod01.getUserGuessNumber();
        randomNumberWithMethod01.matchNumberWithGuessNumber(userGuessNumber);
    }

    public int getUserGuessNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("1-100 arasında sayı giriniz : ");
            number = scanner.nextInt();

        } while (number < 1 || number > 100);

        return number;
    }

    public void matchNumberWithGuessNumber(int userGuessNumber) {
        Random random = new Random();
        int randomNumberForUser;
        int sayac = 0;
        while (true) {
            randomNumberForUser = random.nextInt(100) + 1;
            sayac++;
            if (randomNumberForUser == userGuessNumber) {
                if (sayac == 1) {
                    System.out.println("Tebrikler!!! 100 Milyon dolar kazandınız!!!");
                } else if (sayac > 1 && sayac <= 30) {
                    System.out.println("Tebrikler 5 Milyon dolar kazandınız");

                } else if (sayac > 30 && sayac <= 50) {
                    System.out.println("Tebrikler 1 Milyon dolar kazandınız");

                } else {
                    System.out.println("Üzgünüm kazanamadınız");
                }
                break;
            }

        }

    }
}