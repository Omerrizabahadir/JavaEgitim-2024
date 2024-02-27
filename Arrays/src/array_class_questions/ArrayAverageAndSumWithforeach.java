package array_class_questions;

public class ArrayAverageAndSumWithforeach {
   /* 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 sayılarını bir dizi içerisine tanımlayınız.
    Daha sonra for/foreach kullanarak toplamını bulup ekrana yazdıran ve
     sonrasında ise ortalamasını da hesaplayan ekrana yazdıran java kodunu yazınız.
    */

    public static void main(String[] args) {
       int[] numbers={2, -9, 0, 5, 12, -25, 22, 9, 8, 12};

       int sum=0;
       double average;
       for (int number:numbers){

           sum=number+sum;
       }
      int arrayLength=numbers.length;
       average=((double) sum/(double) arrayLength);

        System.out.println("Total :"+sum);
        System.out.println("Average :"+average);
    }
}
