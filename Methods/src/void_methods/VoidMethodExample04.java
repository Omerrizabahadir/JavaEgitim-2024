package void_methods;

import java.util.Scanner;

public class VoidMethodExample04 {
    public static void main(String[] args) {




       // int number1=5, number2=9;
       // String name="bilgeadam";
      // sum(number1,number2,name);

        //yukardakilerin yerine direkt metodu yaıp int String değerler orad tanımlanarakta olur
        Scanner scanner=new Scanner(System.in);
        System.out.println("adınızı girin");
        String name=scanner.next();

        sum(5,9,name);
    }
    public static void sum(int num1, int num2,String ad){

        System.out.println(ad+" İki sayının Toplamı: "+(num1+num2));
    }
}
