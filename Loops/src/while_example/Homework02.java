package while_example;

import java.util.Random;

public class Homework02 {
    public static void main(String[] args) {
           /*
    Bu sefer örneğimiz üzerinde bilgisayarın iki zar atmasını
    ve bu zarların her ikisinin de 6 gelmesi durumuna kadar döngüye devam etmesini isteyelim.
     Bu işlemi gerçekleştirebilmek için Random() sınıfından yardım alacağız.
     */

        int zar1=1;
        int zar2=1;
        int deneme=0;

        Random rastgele=new Random();



        while (zar1>0 && zar2>0){

            zar1=rastgele.nextInt(6)+1;  //Eğer rastgele sayı alırken 0'dan değilde 1'den başlamasını ve 100 sayısının da dahil edilmesini istiyorsak;

            zar2=rastgele.nextInt(6)+1;
            deneme++;

            System.out.println("Deneme "+deneme +":"+zar1+" ve " + zar2);

            if (zar1==6 & zar2==6){
                break;
            }else {
                continue;
            }
        }

    }
}
