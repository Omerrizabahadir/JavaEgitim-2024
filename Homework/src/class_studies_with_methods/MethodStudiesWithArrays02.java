package class_studies_with_methods;

import java.util.Scanner;

public class MethodStudiesWithArrays02 {
    /*
   Kullanıcıdan kaç adet sayı girmek istediğini al      -->metod ile
   Gireceği kadar sayıyı array içerisine at             -->metod ile
   Array2deki sayıların toplamı ve ortalamalarını bul   -->metod ile
    */

    public static void main(String[] args) {
        MethodStudiesWithArrays02 methodStudiesWithArrays02 = new MethodStudiesWithArrays02();
        int diziUzunlugu = methodStudiesWithArrays02.kullanicidanDiziUzunlugunuAl();
        int[] dizi = new int[diziUzunlugu];
        dizi = methodStudiesWithArrays02.kullanicidanDiziyeSayilariAl(dizi);
        methodStudiesWithArrays02.dizidekiSayilarinToplamiOrtalamasi(dizi);
    }

    public int kullanicidanDiziUzunlugunuAl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı girmek istesiniz ?");
        int diziUzunlugu = scanner.nextInt();

        return diziUzunlugu;
    }

    public int[] kullanicidanDiziyeSayilariAl(int[] dizi) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int number;
        while (true) {
            System.out.println("sayı giriniz : ");
            number = scanner.nextInt();
            dizi[i] = number;
            i++;
            System.out.println(number + "--> " + i + ". sayı : ");
            if (i == dizi.length) {
                break;
            }
        }
        return dizi;
    }

    public void dizidekiSayilarinToplamiOrtalamasi(int[] dizi) {
        int toplam = 0;

        System.out.println("Dizi : ");
        for (int i : dizi) {
            System.out.println(i);
            toplam = toplam + i;
        }
        System.out.println("Dizideki sayılar toplamı :" + toplam);
        System.out.println("Dizideki sayılar ortalaması : " + (double) toplam / dizi.length);
    }
}



