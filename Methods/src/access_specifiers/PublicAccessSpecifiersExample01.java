package access_specifiers;

import return_methods.Homework01;
import static_methods.StaticMethodExample02;

public class PublicAccessSpecifiersExample01 {

    public static void main(String[] args) {

        //public olan erişim belirtecimle staticMethodExample02 metoduna erişmek istiyorum
        //önce o metodun sınıfını new ile üret ve . deyip metodu çağır
        StaticMethodExample02 staticMethodExample02 = new StaticMethodExample02();
        staticMethodExample02.topla(7, 90);  //dönüş değerini vermez metod void old için ama parametreleri toplar

        System.out.println(" İki sayıdan hangisi büyük  :" + (Homework01.hangisiBuyuk(2, 9)));
        /* yukardaki metod için
        Homework01 sınıfında int dönen metod için burada Homework01.hangisiBuyuk(2,9); dersek
        çalışmıyor.bunu System.out.println()ile baıyorsun yukardaki gibi

        */


        //private için erişilir mi farklı paketten hayır
        //private sadeceaynı pakat ve aynı sınıf olacak
        PrivateMethodExample01 privateMethodExample01=new PrivateMethodExample01();
        //privateMethodExample01.topla(3,5);


    }
}
