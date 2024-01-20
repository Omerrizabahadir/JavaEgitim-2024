package return_methods;

public class Homework01 {

    //return type ile büyük sayıyı bulan
    // ve büyük sayıya 10 ekleyen metod yazınız

    public static void main(String[] args) {

        int number1;
        int number2;

        int sonuc=hangisiBuyuk(90,98);

        System.out.println("Büyük sayı "+sonuc);

        System.out.println(sonuc+ (10));




    }
    public static int hangisiBuyuk(int num1,int num2) {
        if (num1 > num2) {

            return num1;

        } else if (num2 > num1) {
            return num2;
        }else {
            return num1;        //eşitsede num1 dönsün dedik
        }

    }
}
