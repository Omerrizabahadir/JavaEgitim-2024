package begin_with_java_questions;

public class Solution13 {

    //1'den 500'e kadar olan tüm Armstrong sayılarını yazdıran bir program yazınız.
    // Eğer sayının her basamağının küpleri toplamı sayının kendisine eşitse
    // bu sayıya Armstrong sayısı denir.
    //Örneğin, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

    public static void main(String[] args) {

Solution13 solution13=new Solution13();
        System.out.println("Armstrong sayıları:");
solution13.armstrongSayisiBul();

    }
    public void armstrongSayisiBul(){

        int digit1,
                digit2,
                digit3;

        for (int i=1;i<=500;i++){

            int temp=i;
            digit1=temp%10;

            temp=temp/10;
            digit2=temp%10;

            temp=temp/10;
            digit3=temp%10;

            if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3==i){

                System.out.println(i);
            }

        }
    }
}
