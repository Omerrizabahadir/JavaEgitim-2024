package homework03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int toplam = 0;
        int ortalama = 0;

        int[] arrays = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("1'den 100'e kadar 10 adet sayı giriniz");


        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt();

            while (arrays[i] >= 100) {

                System.out.println("Girdiğiniz sayı 100 ile 1 arasında olmalıdır .Lütfen tekrar sayınızı giriniz");
                if (arrays[i] >= 100) {
                    arrays[i] = scanner.nextInt();

                }
            }
        }
        for (int newArray : arrays) {
            System.out.print(" \t " + newArray);
            toplam = toplam + newArray;
        }
        System.out.println("\nDizinin sayıları toplamı : " + toplam);
        System.out.println("Dizideki sayıların ortalaması  : " + (double) toplam / arrays.length);
    }
}
