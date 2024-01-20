package do_while_example;

import java.util.Random;

public class DoWhileExample02DigerCozum {
    public static void main(String[] args) {
        int zar1=0,zar2=0,deneme=0;
        boolean zarAt=true;
        Random random=new Random();

        do {
            zar1=random.nextInt(6)+1;
            zar2=random.nextInt(6)+1;
            deneme++;
            System.out.println(deneme+". deneme -> zar1 : " + zar1 + " , zar2 : " + zar2);
        if (zar1==6 & zar2==6){
            zarAt=false;
        }
        }while (zarAt);//while içinde zarAt=true yerine sadece true kullanılırsa if içinde break olacaktı

    }
}
