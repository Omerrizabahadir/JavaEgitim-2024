package array_examples;

import java.util.Random;

public class Homework02 {
    public static void main(String[] args) {
            /*
    1 ile 50 arasında (1 ile 50 dahil) olmak üzere Random sınıfı ile 20 tane değer üretip
    bu değerleri array içerisine atınız.
    Daha sonrasında bu değerlerin toplamı ve ortalamasını bulunuz ekrana yazınız.
     */
        Random random = new Random();
        int[] num=new int [20];
        int sum=0;

        for (int i=0;i<num.length;i++){
            num[i]=random.nextInt(50)+1;
            sum=sum+num[i];

            System.out.println(i);
        }
        System.out.println("Toplam : "+sum);
        double average=(double) sum/ num.length;
        System.out.println(average);







    }
}
