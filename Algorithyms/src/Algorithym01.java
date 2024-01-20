import java.util.Scanner;

public class Algorithym01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz :");
        int number1=scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("İkinci sayıyı giriniz :");
        int number2;
        number2=scanner1.nextInt();
        int toplam=number1+number2;
        int carpim=number1*number2;
        int cikarma= number1-number2;
        int bolme= number1/number2;
        System.out.println("Girilen iki sayının toplamı :" + toplam);
        System.out.println("Girilen iki sayının çarpımı :" + carpim);
        System.out.println("Girilen iki sayıdan çıkarma  :" + cikarma);

        if (bolme==0){
            System.out.println("iki sayı bölünmez");
            System.exit(bolme);
        }else
        System.out.println("Girilen iki sayının bolmesi :" + bolme);

    }
}
