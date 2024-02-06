package homework04;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Taking numbers from users and adding numbers to the array
        kullanıcıdan kaç adet sayı gireceğini al ve sayı girdirt ve sonra bunları diziye ata
        sonra bu sayıların ortalamasını,toplamını, tek çift değerlerini yazan program
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinizin kaç elemanlı olmasını istersiniz?");
        int userNumber = scanner.nextInt();
        int[] userNumberArray = new int[userNumber];
        int sum=0;
        int average=0;
        String tekSayi=" Tek sayı";
        String ciftSayi=" Çift Sayı";



        for (int i = 0; i < userNumber; i++) {
            System.out.println(i+". elemanı giriniz");
            userNumberArray[i] = scanner.nextInt();
            sum=sum+userNumberArray[i];
            if (userNumberArray[i]%2==0){

                System.out.println(userNumberArray[i]+ciftSayi);
            }else{


                System.out.println(userNumberArray[i]+tekSayi);
            }
        }

        for (int i = 0; i < userNumberArray.length; i++) {
        }


        System.out.println("Oluşturduğunuz dizi :" + Arrays.toString(userNumberArray));
        System.out.println("Dizideki sayıların toplamı :"+sum);
        System.out.println("Dizideki sayıların toplamı :"+(double)sum/userNumber);


    }

}



