package medium_com_sorulari;

public class Soru4YildizliSoru {
    /*
    Soru4: Aşağıdaki görüntüyü konsol ekranına yazdıran algoritmayı tasarlayınız.
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * * * *
    * * * * * * *
    * * * * * * * *
    * * * * * * * * *
    * * * * * * * * * *

     */
    public static void main(String[] args) {
    Soru4YildizliSoru soru4=new Soru4YildizliSoru();
    soru4.sekliEkranaYaz();
    }
    public void sekliEkranaYaz(){
        int uzunluk=10;
        for (int satir=0;satir<uzunluk;satir++){
            System.out.println("");

            for (int sutun=0;sutun<satir;sutun++){
                System.out.print(" * ");

            }
            System.out.println("");
        }
    }
}
