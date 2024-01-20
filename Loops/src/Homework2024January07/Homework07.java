package Homework2024January07;

public class Homework07 {
    public static void main(String[] args) {
        // Bir while döngüsü kullanarak, 1'den başlayarak
        // Fibonacci dizisinin ilk 10 terimini ekrana yazdıran bir Java programı nasıl yazılır?

        /*1.terim 1
          2.terim 1
          3.terim 1+1=2
          4.terim 1+2=3
          5.terim 2+3=5
          6.terim 3+5=8
          7.terim 5+8=13
          8.terim 8+13=21
          9.terim 13+21=34
          10.terim 21+34=55
         */

        int num1 = 0, num2 = 1, num3=2,sayac=0;

       while (sayac<=10){
           System.out.println(num1);
           num3=num1+num2;
           num2=num1;
           num1=num3;
           sayac++;
       }

    }}
