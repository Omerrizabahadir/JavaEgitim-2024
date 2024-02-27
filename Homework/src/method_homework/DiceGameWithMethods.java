package method_homework;

import java.util.Random;
import java.util.Scanner;

public class DiceGameWithMethods {
    public static void main(String[] args) {
        DiceGameWithMethods diceGameWithMethods=new DiceGameWithMethods();
        int kullaniciSayisi=diceGameWithMethods.kullaniciSayisiAl();
        diceGameWithMethods.oyna(kullaniciSayisi);
    }

    public int kullaniciSayisiAl() {
        Scanner scanner = new Scanner(System.in);
        int kullaniciSayisi = 0;
        while (true) {
            System.out.println("Lütfen 4 ile 24 arasında bir sayı giriniz : ");
            kullaniciSayisi = scanner.nextInt();
            if (kullaniciSayisi >= 4 && kullaniciSayisi <= 24) {
                break;
            } else {
                System.out.println("Geçersiz giriş. Lütfen 4 ile 24 arasında bir sayı giriniz : ");
            }
        }
        return kullaniciSayisi;
    }
    public int oyna(int kullaniciSayisi){
    Random random = new Random();
    int toplamKazanc = 0;
        for (int i = 1; i <= 11; i++) {
        int zar1 = random.nextInt(6) + 1;
        int zar2 = random.nextInt(6) + 1;
        int toplamZar = zar1 + zar2;
        int tahminEdilenSayi = tahminEdilenSayiHesapla(toplamZar);
        if (i == 1 || i == 2) {
            if (tahminEdilenSayi == kullaniciSayisi) {
                toplamKazanc += 3000000;
            }
        } else if (i >= 3 && i <= 6) {
            if (tahminEdilenSayi == kullaniciSayisi) {
                toplamKazanc += 1000000;
            }
        } else if (i >= 7 && i <= 10) {
            if (tahminEdilenSayi == kullaniciSayisi) {
                toplamKazanc += 500000;
            }
        } else {
            toplamKazanc += 50;
        }
    }
        System.out.println("Toplam kazanç : " + toplamKazanc + " dolardır");
        return toplamKazanc;
    }
    public int tahminEdilenSayiHesapla(int toplamZar) {
        return toplamZar * 2;
    }
}