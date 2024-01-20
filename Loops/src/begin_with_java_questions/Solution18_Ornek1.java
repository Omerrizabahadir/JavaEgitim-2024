package begin_with_java_questions;

public class Solution18_Ornek1 {
   //javada piramit yapımı

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++)
        {
            for (int bosluk = 5; bosluk > i ; bosluk--)
            {
                System.out.print(" ");
            }

            for (int yildiz = 0; yildiz < (i*2)-1; yildiz++)
            {
                System.out.print("*");
            }
            System.out.println();

    }


    }

}
