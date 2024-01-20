package while_example;

public class WhileLoop03 {

    public static void main(String[] args) {

        int number=10;
        int sayac=0;

        int toplam=0;

        while (number>=sayac){
            toplam=toplam+sayac;
           sayac++;

            if (sayac==number)
                System.out.println(toplam);
        }

    }

}
