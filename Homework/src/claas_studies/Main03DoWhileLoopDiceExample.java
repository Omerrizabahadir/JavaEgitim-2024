package claas_studies;

import java.util.Random;

public class Main03DoWhileLoopDiceExample {

    public static void main(String[] args) {
        int zar1;
        int zar2;
        Random random=new Random();
        do {
            zar1= random.nextInt(6)+1;
            zar2=random.nextInt(6)+1;
            if (!(zar1==6 && zar2==6)) {
                System.out.println(zar1 + " " + zar2);

            }else {
                break;
            }


        }while (true);




    }
}
