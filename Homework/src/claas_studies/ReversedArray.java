package claas_studies;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        int[] reversedArray = new int[5];

        System.out.println("İlk dizi :");
        for (int i = 0; i < array.length; i++) {

        }
        System.out.println(Arrays.toString(array));
        System.out.println(" Dizinin ters çevrilmiş hali:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(i + ". elemanı = " + array[i]);
        }
    }
}