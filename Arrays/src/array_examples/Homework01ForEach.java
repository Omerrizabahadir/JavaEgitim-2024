package array_examples;

public class Homework01ForEach {
    public static void main(String[] args) {
        /*2,-9,0,5,12,-25,22,9,8,12 sayılarını bir dizi içerisine tanımlayınız
        daha sonra for/for each kullanarak toplamlarını bulup ekrana yazdıran
        ve sonrasında ise ortalamalarını hesaplayan ve ekrana yazdıran java kodunu yazınız
         */

        int[] numbers={2,-9,0,5,12,-25,22,9,8,12};
        int sum=0;


        System.out.println("Numbers dizinin elemanları : ");
        for(int i : numbers){
            sum+=i;

        }
        System.out.println("Toplam : "+sum);
        double average=(double) sum/ numbers.length;
        System.out.println("Ortalama :"+average);
    }
}
