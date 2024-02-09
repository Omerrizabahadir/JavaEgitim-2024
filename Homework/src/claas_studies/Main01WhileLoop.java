package claas_studies;

import java.util.Scanner;

public class Main01WhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        int top = 0;
        int ort=0;
        int sayac = 0;



        while (true) {

            sayac++;
            System.out.println("sayı giriniz");
            sayi= scanner.nextInt();

            if ((sayi== 0)) {

                top = top+sayi;

            }else {
                break;
            }
        }
        System.out.println("sayıların ortalaması :" + (double) top / sayac);
    }
}