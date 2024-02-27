package array_with_loop_for;

import java.util.Arrays;

public class ArrayWithForLoop {
    public static void main(String[] args) {
        int [] age= {12,4,5};

        for (int i=0;i<age.length;i++){
            System.out.println(age[i]);
        }
        System.out.println("Dizideki değerler dizi olarak çıktı :"+Arrays.toString(age));
    }
}
