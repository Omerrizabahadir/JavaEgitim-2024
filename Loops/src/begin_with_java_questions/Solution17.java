package begin_with_java_questions;

import java.util.Random;
import java.util.Scanner;

public class Solution17 {
    //Rastgele bir sayı üreten ve
    // kullanıcıdan bu sayının ne olduğunu tahmin etmesini isteyen bir program yazınız.
    // Kullanıcının tahmini rastgele sayıdan yüksekse program "Çok yüksek, tekrar deneyin" mesajını göstermelidir.
    // Kullanıcının tahmini rastgele sayıdan düşükse program "Çok düşük, tekrar deneyin" mesajını göstermelidir.
    // Program, kullanıcı rastgele sayıyı doğru tahmin edene kadar tekrar eden bir döngü kullanmalıdır.

    public static void main(String[] args) {

        Solution17 solution17 = new Solution17();
        solution17.tahminEt();
    }

    public void tahminEt() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        int guess;
        int tries = 0;


        do {
            guess = random.nextInt(50);
            System.out.println("tahmin için bir sayı giriniz ");
            userNumber = scanner.nextInt();
            System.out.println("rastgele sayi");
            guess = random.nextInt();
            tries++;


            if (userNumber > guess) {
                System.out.println("Çok yüksek tekrar deneyin");
            } else if (userNumber < guess) {
                System.out.println("Çok düşük tekrar deneyin");
            } else {
                System.out.println("Tebrikler sayıyı doğru tahmin ettiniz!!! ");
            }
        } while (userNumber != guess);


    }
}
