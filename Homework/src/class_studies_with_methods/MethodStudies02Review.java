package class_studies_with_methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodStudies02Review {
    /*
  Kullanıcıdan kaç adet sayı girmek istediğini al      -->metod ile
  Gireceği kadar sayıyı array içerisine at             -->metod ile
  Array2deki sayıların toplamı ve ortalamalarını bul   -->metod ile
   */
    public static void main(String[] args) {
        MethodStudies02Review methodStudies02Review = new MethodStudies02Review();
        int arrayLength = methodStudies02Review.getArrayLengthNumberFromUser();
        int[] array = new int[arrayLength];
        array=methodStudies02Review.getArrayNumbersFromUsers(array);
        methodStudies02Review.calculateSumAverageOfArrayElements(array);
    }
    public int getArrayLengthNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz?");
        int arrayLenght = scanner.nextInt();

        return arrayLenght;
    }
    public int[] getArrayNumbersFromUsers(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("sayı giriniz :");
            int number = scanner.nextInt();
            array[i]=number;
        }

        return array;
    }
    public void calculateSumAverageOfArrayElements(int[]array){
        int sum=0,average=0;

        for (int arr:array){
            sum+=arr;
            System.out.println(arr);
        }
        System.out.println("Dizinin elemanları toplamı : "+sum);
        System.out.println("Dizinin elemanları tortalaması : "+(double)sum/array.length);

    }
}
