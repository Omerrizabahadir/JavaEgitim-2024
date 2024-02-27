package claas_studies;

import java.util.Random;
import java.util.Scanner;

public class Odev04 {
    /*
    Kullanıcıdan 1 adet sayı istensin. 4 ile 24 (dahil)arasında -->method ile
    Bir çift zar random atılsın. Bu zarların toplamının iki katı eğer kullanıcının girdiği sayı ile aynı ise -->metod
    1 ve 2.(dahil) atışta doğru ise 3 milyon
    3 ve 6.(dahil) atışta bilirse 1 milyon
    7 ve 10 atışta 500 bin
    11 ve büyük ise bonus

    en az iki metod olacak
     */
    public static void main(String[] args) {
        Odev04 odev04 = new Odev04();
        int zarAdedi=0,sum=0;
        zarAdedi=odev04.kullaniciZarAdediAl(zarAdedi);
        int sayac=0,zar1=0,zar2=0;
        sayac=odev04.zarAtma(zarAdedi,sum,sayac);
        odev04.zarAdediVeZarAtmaKarsilastir(sayac);

    }

    public int kullaniciZarAdediAl(int zarAdedi) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet zar atılsın");
         zarAdedi = scanner.nextInt();

        return zarAdedi;
    }

    public int zarAtma(int zarAdedi,int sum,int sayac) {
        Random random = new Random();
        int zar1 = random.nextInt(6) + 1;
        int zar2 = random.nextInt(6) + 1;
        sum = zar1 + zar2;
        sum*=2;
        sayac=0;
        while (true){
            sayac++;
            if(zarAdedi==sum){

            }
            return sayac;
        }

    }
    public void zarAdediVeZarAtmaKarsilastir(int sayac){
        if (sayac<=2){
            System.out.println("Tebrikler 3 Milyon kazandınız!");
        } else if (sayac>2 || sayac<=6) {
            System.out.println("Tebrikler 1 Milyon kazandınız!");

        }else if (sayac>6 || sayac<=10){
            System.out.println("Tebrikler 500 bin kazandınız!");

        }else {
            System.out.println("bonus hakkı kazandınız");

        }

    }

}
