package begin_with_java_questions_tekrar;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int num=0;
        int f=1;
        System.out.println("Faktöryel hesaplamak için sayınızı giriniz");
        num=scanner.nextInt();

        for (int i=1;i<=num;i++){
            f=f*i;

        }
        System.out.println(num+"!"+" = "+f);
    }
}
