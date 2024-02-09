package begin_with_java_questions_tekrar;

import java.util.Scanner;

public class ReverseNumber {
    /*
    Write a program that prompts the user to input an integer and
    then outputs the number with the digits reversed.
    For example, if the input is 12345, the output should be 54321.
    Kullanıcıdan bir tamsayı girmesini isteyen ve
    daha sonra bu sayıyı, rakamları ters çevrilmiş olarak veren bir program yazınız.
     Örneğin giriş 12345 ise çıkış 54321 olmalıdır.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        int tersi = 0;


        System.out.println("Lütfen en az iki basamaklı tamsayı giriniz");
        sayi = scanner.nextInt();

        int aralık = sayi;
        int kalan = 0;

        while (aralık > 0) {
            kalan = aralık % 10;
            tersi = tersi * 10 + kalan;
            aralık = aralık / 10;
        }
        System.out.println("Sayınız : " + sayi + " \nSayınızın tersi :" + tersi);
    }
}


