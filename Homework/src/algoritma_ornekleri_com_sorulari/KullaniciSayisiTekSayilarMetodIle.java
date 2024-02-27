package algoritma_ornekleri_com_sorulari;

import java.util.Arrays;
import java.util.Scanner;

public class KullaniciSayisiTekSayilarMetodIle {
    /*
    Kullanıcının Girdiği Aralıktaki Tek Sayıları Yazdıran Java Programı
     */
    public static void main(String[] args) {
        KullaniciSayisiTekSayilarMetodIle kullaniciSayisiTekSayilarMetodIle = new KullaniciSayisiTekSayilarMetodIle();
        int altSayi = kullaniciSayisiTekSayilarMetodIle.kullaniciAltSayiAl();
        int ustSayi = kullaniciSayisiTekSayilarMetodIle.kullaniciUstSayisiAl();
        kullaniciSayisiTekSayilarMetodIle.kullaniciSayilariKarsilastir(altSayi, ustSayi);

    }

    public int kullaniciUstSayisiAl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir üstsayı girin : ");
        int ustSayi = scanner.nextInt();

        return ustSayi;
    }

    public int kullaniciAltSayiAl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alt sayı girin :");
        int altSayi = scanner.nextInt();
        return altSayi;
    }

    public void kullaniciSayilariKarsilastir(int altSayi, int ustSayi) {
        System.out.println("Üst sayı ve Alt sayı arasındaki tek sayılar : ");
        for (int i = altSayi; i <= ustSayi; i++) {
            if (!(i % 2 == 0)) {
                System.out.print("\t"+i);
            }

        }

    }
}
