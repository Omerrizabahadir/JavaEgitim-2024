package array_examples;

import java.util.Random;

public class Homework02Tekrar {

    public static void main(String[] args) {
        Random random=new Random();
        int [] numbers=new int[20];
        int toplam=0;

        for (int i=0;i<numbers.length;i++){
           numbers[i]=random.nextInt(50)+1;
            System.out.println(numbers[i]);
            toplam=toplam+ numbers[i];
        }


        System.out.println("Sayıların Toplamı :"+toplam);
        double ortalama=0;
        ortalama=(double) toplam/ numbers.length;
        System.out.println("Sayıların ortalaması :"+ortalama);
    }
}
