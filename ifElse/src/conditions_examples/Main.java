package conditions_examples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int speed=60;
        double ceza;
        System.out.println("Hız Limitini ihlal ettiniz \nCezanız  :");

        Scanner scanner=new Scanner(System.in);

        double hizGiris =scanner.nextInt();

        if(speed<50){
           ceza=speed*2;
            System.out.println( ceza);
        } else if (speed>=50 && speed<70) {
            ceza=speed/2;
            System.out.println(ceza);
        } else if (speed>=70 && speed<85) {
            ceza=speed;
            System.out.println(ceza);
        }else {
            ceza=speed*3;
            System.out.println(ceza);
        }
    }
}
