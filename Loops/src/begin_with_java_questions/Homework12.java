package begin_with_java_questions;
import java.lang.Integer;
import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
       // Kullanıcının istediği kadar sayıları girebilecek
        // ve sonunda programın girilen en büyük ve en küçük sayıları göstermesini sağlayacak
        // bir program yazın.

        Scanner scanner=new Scanner(System.in);

        int userNumber;
        int maxValue=0;
        int minValue=0;
        char choice;

do {
    System.out.println("Enter the number!");
    userNumber=scanner.nextInt();

    if (userNumber>minValue){
        minValue=userNumber;
    } if(userNumber<maxValue) {
        maxValue=userNumber;
    }

    System.out.println("Do u want to continue enter (yes/no)");
    choice=scanner.next().charAt(0);

}while (choice=='y' || choice=='Y');
        System.out.println("Largest number is :"+minValue);
        System.out.println("Smallest number is :"+maxValue);
    }
}
