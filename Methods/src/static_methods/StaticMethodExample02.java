package static_methods;

import java.util.Random;

public class StaticMethodExample02 {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(50);


        StaticMethodExample02.cikar(5, 8);     //static method ise çekebiliriz

        //  topla();  //static metod değilse direkt çekemeyiz.bunun için new ile sınıfını çağırmalıyız

        StaticMethodExample02 staticMethodExample02=new StaticMethodExample02();
        staticMethodExample02.topla(12,9);


    }

    public void topla(int number1, int number2) {
        System.out.println("toplam :" + (number1 + number2));
    }

    public static void cikar(int number1, int number2) {
        System.out.println("çıkarım :" + (number1-number2));
    }
}
