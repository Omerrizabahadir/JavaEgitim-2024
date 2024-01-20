package while_example;

import java.util.Random;

public class Homework02HocaCozumu {
    public static void main(String[] args) {
        int zar1=0,zar2=0,deneme=0;
        boolean zarAt=true;

        Random random=new Random();

        while (zarAt){   //buraya true deseydik o zaman if in sonuna zarAt=false; yerine break koyacaktık
            zar1=random.nextInt(6)+1;
            zar2=random.nextInt(6)+1;
            System.out.println(deneme+". deneme:"+zar1+" ve "+zar2);
            deneme++;

            if (zar1==6 & zar2==6){
                zarAt=false;    //artık zar atmayacak
                System.out.println(--deneme+". denemede "+"6 ve 6 yı buldunuz");
            }
        }

    }
}
