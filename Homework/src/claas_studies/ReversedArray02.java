package claas_studies;

import java.util.Scanner;

public class ReversedArray02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array=new int[5];
        int[] reversedArray=new int[5];
        System.out.println("Dizi için 5 adet sayı giriniz");


        for(int i=0;i< array.length;i++) {
            System.out.println("sayı giriniz :");
            array[i]= scanner.nextInt();
            reversedArray[array.length-1]=array[i];
        }
        for (int i=array.length-1;i>=0;i--){
            System.out.println(array.length-1-i+". elemanı "+array[i]);
        }

    }
}
