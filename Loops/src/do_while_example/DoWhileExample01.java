package do_while_example;

public class DoWhileExample01 {
    public static void main(String[] args) {
        int start=0;

        boolean devamEt=true;
        do {

            System.out.println("start value :"+start);
            start++;



        }while (start<=5);

    }

    public static class Odev08 {
        public static void main(String[] args) {

            //Bir do-while döngüsü kullanarak,
            // 1 ile 50 arasındaki sayıların karelerini
            // ekrana yazdıran bir Java kodu


            System.out.println("1 ile 50 arası çift sayılar ");

            int sayi=0;
            boolean ciftSayi=true;

            do {
                sayi+=2;
                if(sayi%2==0 && sayi!=50){
                    System.out.print("\t "+sayi);
                }

            }while (sayi>1 && sayi<50);

        }


    }
}
