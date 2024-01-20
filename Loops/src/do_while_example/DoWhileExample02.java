package do_while_example;

import java.util.Random;

public class DoWhileExample02 {
    public static void main(String[] args) {
        int zar1=0,zar2=0,deneme=0;
        boolean zarAt=true;
        Random random=new Random();

        do {
           zar1=random.nextInt(6)+1;
           zar2=random.nextInt(6)+1;
            deneme++;
            System.out.println(deneme+". deneme "+zar1+" ve "+zar2);

        }while (!(zar1==6 &zar2==6));


    }
}
