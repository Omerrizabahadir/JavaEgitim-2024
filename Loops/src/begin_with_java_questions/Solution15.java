package begin_with_java_questions;

import java.util.Scanner;

public class Solution15 {

    // //Kullanıcı tarafından n girilen aşağıdaki serilerin toplamını hesaplayan bir program yazın.
    //        //1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
    public static void main(String[] args) {

        Solution15 solution15=new Solution15();
        solution15.girilenSayilariTopla();
    }

    public void girilenSayilariTopla() {
        Scanner scanner = new Scanner(System.in);
        double userNum;

       double sum=0;

            System.out.println("Enter the number!");
            userNum = scanner.nextDouble();

            for (int i=1;i<=userNum;i++){
                sum+=0.1/i;
            }
        System.out.println(sum);
    }
}
