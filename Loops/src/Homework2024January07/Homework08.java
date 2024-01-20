package Homework2024January07;

public class Homework08 {
    //Bir do-while döngüsü kullanarak,
    // 1 ile 50 arasındaki sayıların karelerini ekrana yazdıran bir Java kodu
    public static void main(String[] args) {

        int sayi = 1;
        System.out.println("1-50 arası sayıların karesi:");

        do {
            int kare;
            kare = sayi * sayi;

            sayi++;
            System.out.println(kare);

        } while (sayi < 50);
    }

}
