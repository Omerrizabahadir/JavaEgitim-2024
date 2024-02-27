package medium_com_sorulari;

import java.util.Scanner;

public class Soru2 {
    /*Soru2: Kullanıcının konsol ekrandan 4 temel matematiksel işlemi yapabildiği bir program yazmanız bekleniyor.
    Program aşağıdaki özellikleri sağlamalıdır.
    Yapılabilecek temel işlemler: Toplama, Çıkarma, Çarpma, Bölme
    Kullanıcıya 4 işlemden birini seçeceği menüyü konsol ekrana yazdırın.
     Örneğin: 1-Toplama, 2-Çıkarma vb…
    Ardından kullanıcıdan 2 adet tamsayı tipinde sayı girmesini isteyin.
     Bu girilen iki sayıyı değişkenlerde saklayın.
    Seçilen işlem tipine göre matematiksel işlemi yapın ve konsol ekranına yazdırın.
     */
    public static void main(String[] args) {
        Soru2 soru2=new Soru2();
        soru2.menu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz : ");
        int girilenSayi1 = scanner.nextInt();
        System.out.println("İkinci Sayıyı giriniz : ");
        int girilenSayi2 = scanner.nextInt();
        int islemSecimi=soru2.kullaniciIslemAl(girilenSayi1,girilenSayi2);

    }
        public void menu() {

        System.out.println("-------------------");
        System.out.println(" 1-     Toplama    ");
        System.out.println(" 2-     Çıkarma    ");
        System.out.println(" 3-     Çarpma     ");
        System.out.println(" 4-     Bölme      ");
        System.out.println("İşlem türünü seçiniz");
    }

    public int kullaniciIslemAl(int girilenSayi1,int girilenSayi2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("işlem seçiniz");
        int islemSecimi = scanner.nextInt();
        if (islemSecimi == 1) {
            int toplam = girilenSayi1 + girilenSayi2;
            System.out.println("toplam işlemi sonucu = " + toplam);
            return toplam;
        } else if (islemSecimi == 2) {
            int cikarma = girilenSayi1 - girilenSayi2;
            System.out.println("çıkarma işlemi sonucu = " + cikarma);
            return cikarma;
        } else if (islemSecimi == 3) {
            int carpma = girilenSayi1 * girilenSayi2;
            System.out.println("çarpma işlemi sonucu = " + carpma);
            return carpma;

        } else if (islemSecimi == 4) {
            int bolme = girilenSayi1 / girilenSayi2;
            System.out.println("bölme işlemi sonucu = " + (double) girilenSayi1 / girilenSayi2);
            return bolme;

        } else {

                System.out.println("Tanımsız sayı girdiniz.");

            }

        return islemSecimi;
    }
    }


