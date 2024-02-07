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
        int sayac1=0;
        for (int i = 0; i < userNumber; i++) {
            System.out.println((sayac1+1) + ". sayıyı giriniz");
            userNumberArray[i] = scanner.nextInt();
            sayac1++;
            sum = sum + userNumberArray[i];
        }

        for (int i = 0; i < userNumberArray.length; i++) {

        }

        System.out.println("Oluşturduğunuz dizi :" + Arrays.toString(userNumberArray));
        System.out.println("Dizideki sayıların toplamı :"+sum);
        System.out.println("Dizideki sayıların ortalaması :"+(double)sum/userNumber);


        int sayac2=0,sayac3=0;
        for (int i=0;i<userNumber;i++){
            if (userNumberArray[i]%2==0 || userNumberArray[i]==0){
                System.out.println(userNumberArray[i]+" çifttir");
                sayac2++;
            }else{
                System.out.println(userNumberArray[i]+" tektir");
                sayac3++;
            }
        }
            System.out.println("Dizideki çift sayılar "+sayac2+" adet");
            System.out.println("Dizideki tek sayılar "+sayac3+" adet");
        }
    }





