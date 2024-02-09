package begin_with_java_questions_tekrar;

public class Main02 {
    public static void main(String[] args) {
        /*
        Write a program to calculate the sum of first 10 natural number with while loop.
         */

        int number = 10;
        int sayac = 1;
        int sum = 0;
        int average = 0;

        while (sayac <= number) {
            if (sayac <= number) {
                sum = sum + sayac;
                System.out.println(sayac);
                sayac++;

            }
        }

        System.out.println("1'den-10'a 10 doğal sayının toplamı : " + sum);
        System.out.println("1'den-10'a'10 doğal sayının Ortalaması : " + (double) sum/number);
    }
}
