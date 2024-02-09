package begin_with_java_questions_tekrar;

public class Main {
    public static void main(String[] args) {
        /*
        Write a program with do-while to print numbers from 1 to 10.

         */
        int number = 0;
        int sayac = 1;
        System.out.println("1'den 10'a kadar sayılar : ");
        do {
            System.out.println(sayac);
            sayac++;
            if (sayac > 10) {
                break;
            }

        } while (sayac >= number);


    }
}
