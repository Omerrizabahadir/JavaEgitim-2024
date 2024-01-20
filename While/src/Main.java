import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int password=12345;


        Scanner scanner= new Scanner(System.in);
        System.out.println("şifre giriniz:");
       int userPassword=scanner.nextInt();



       while(true){
         if (userPassword==password) {

             System.out.println("şifre başarılı");
             break;
         }else if (userPassword!=password){
                 System.out.println("2 hakkınız kaldı");

             }else {
                 System.out.println("son hakkınız");
                 return;
             }

       }

    }
}