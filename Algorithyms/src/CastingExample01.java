public class CastingExample01 {
    public static void main(String[] args) {
        byte byteNumber=1;
        short shortNumber=127;

        /*Aşağıda shot değeri byte değere atamak istiyor.
        bunda(byte)shortNumber demezsen izin vermez.
        istediği gibi yazsada veri kaybı olabilir
         */
        byte newByteNumber=(byte) shortNumber;


        /*
        burada ise byteNumber !ı short değerine atıyor.short byte dan büyük old için sorun yok
         */
        short newShortNumber= byteNumber;



        //widenin casting(automatic)
        int intNumber=3;


        //double daha büyük int i double a çevirir
        double doubleNumber=intNumber;
        System.out.println(doubleNumber);


        //narrowing casting(manuel)

        //double'ı int e dönüştürmek için (int) yazarsın ama veri kaybı olabilir
        int newIntegerNumber=(int) doubleNumber;
        System.out.println(intNumber);

    }
}
