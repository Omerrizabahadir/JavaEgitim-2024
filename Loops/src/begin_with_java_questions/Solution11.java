package begin_with_java_questions;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        //Kullanıcının istediği kadar sayı girebilecek ve
        // sonunda girilen pozitif, negatif ve sıfır sayılarını görüntüleyecek bir program yazınız.

            Scanner scanner=new Scanner(System.in);

            int userNumber;
            int countPozitiveNumber=0,countNegativeNumber=0,countZeroNumber=0;
            char choice;

            do {
                System.out.println("Enter the number!");
                userNumber = scanner.nextInt();

                if (userNumber > 0) {
                    countPozitiveNumber++;

                } else if (userNumber < 0) {
                    countNegativeNumber++;

                } else {
                    countZeroNumber++;
                }
                System.out.println("Do u want to continue (yes/no)");
                choice=scanner.next().charAt(0);



            }while (choice=='y' || choice=='Y');

        System.out.println("Entered how many  Pozitive numbers from u are/is : "+countPozitiveNumber);
        System.out.println("Entered how many  Negative numbers from u are/is : "+countNegativeNumber);
        System.out.println("Entered how many  Zero number from u are/is : "+countZeroNumber);

    }
}