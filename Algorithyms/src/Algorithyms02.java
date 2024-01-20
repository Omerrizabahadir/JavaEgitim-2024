import java.util.Scanner;

public class Algorithyms02 {

    public static void main(String[] args) {


        System.out.println("İlk saıyı giriniz!!");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("İlk sayı :" + number1);

        System.out.println("İkinci sayıyı giriniz!!");
        Scanner scanner1 = new Scanner(System.in);
        int number2 = scanner1.nextInt();
        System.out.println("İkinci sayı :" + number2);


        int total = number1 + number2;
        System.out.println("İki sayının toplamı :" + total);

    }
}