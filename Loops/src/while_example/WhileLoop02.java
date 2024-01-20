package while_example;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {


        //Kullanıcıdan 0'dan farklı sayı alınana kadar nasıl yazarız while ile

        Scanner scanner = new Scanner(System.in);
        int userNumber;

        while (true){

            System.out.println("Lütfen 0'dan farklı bir sayı giriniz");
            userNumber=scanner.nextInt();

            if (userNumber!=0)
                break;


        }

        System.out.println("program kapatılıyor");

    }
        }




