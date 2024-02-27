package method_homework;

import java.util.Arrays;

public class ReversedArrayWithMethod {
    public static void main(String[] args) {
        ReversedArrayWithMethod reversedArrayWith= new ReversedArrayWithMethod();

        int[] array = {1, 2, 3, 4, 53, 0};
        int[] reversedArray = new int[6];
        array=reversedArrayWith.diziyiGetir(array) ;
    }

        public int[] diziyiGetir(int[] array){
            System.out.println("Dizi :");
            for (int i=0;i<= array.length;i++){
            }
            System.out.println(Arrays.toString(array));
            System.out.println("Dizinin Tersi :");
            for (int i= array.length-1;i>=0;i--){
                System.out.println(i+". elemanı :"+array[i]);
        }
            return array;
        }
    }
