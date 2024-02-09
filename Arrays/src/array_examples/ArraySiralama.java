package array_examples;

import java.util.Random;

public class ArraySiralama {
    //Bilgisayar 1 ile 100 arasında rastgele 10 sayı üretiyor.
    // Üretilen sayıları bir dizi içerisine kayıt edin.
    // Sonrasında diziye kayıt edilen sayıları herhangi bir sıralama algoritması ile sıralayın
    // ve sonrasında ekrana çıktı verin.
    public static void main(String[] args) {

        Random random=new Random();
        int number=0;
        int[]array=new int[10];

        for (int i=1;i<10;i++){
            number=random.nextInt(100)+1;
            array[i]=number;
        }

       for (int k=1;k<10;k++){
           int gecici;
           for (int j=0;j<10-k;j++) {
               if (array[j] > array[j + 1]) {
                   gecici = array[j];
                   array[j] = array[j + 1];
                   array[j + 1] = gecici;
               }

           }
       }
for (int m=0;m<10;m++){
    if (m!=9){
        System.out.println(array[m]+"-");
    }else {
        System.out.println(array[m]);
    }
}
    }

}
