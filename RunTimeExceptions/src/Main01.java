import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz : ");
        //int veri tipinde girilmesi isteniyor başka veri tipi girilirse mismatch hatası verecek
        int number1=scanner.nextInt();
        //System.out.println("number1:"+number1);

    //int sayi=1/0;//AritmeticException hatası

        int array[]=new int[5];
        System.out.println("5'th element in array :"+array[5]);
    }
}