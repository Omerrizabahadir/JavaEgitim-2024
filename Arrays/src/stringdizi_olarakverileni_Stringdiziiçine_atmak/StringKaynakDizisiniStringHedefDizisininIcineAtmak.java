package stringdizi_olarakverileni_Stringdiziiçine_atmak;

public class StringKaynakDizisiniStringHedefDizisininIcineAtmak {
    public static void main(String[] args) {
        String[]kaynakDizisi={"sema","selda","mert","kaan"};

        //kaynak dizimizi oluşturuyoruz
        System.out.println("Kaynak Dizimiz:");
        for (String isim:kaynakDizisi){
            System.out.println(isim);
        }
        //bu kaynak dizisini yeni bir dizinin içine atacaz
        //yeni dizi oluştururuz

        String[] hedefDizisi=new String[kaynakDizisi.length];
        for (int i=0;i< kaynakDizisi.length;i++){
            hedefDizisi[i]=kaynakDizisi[i];
        }

        /*yeni diziyi eski dizinin içindekileri alıp oluşturacaz.ve
        ekrana yazdıracaz
         */


        System.out.println("hedef dizimiz : ");
        for (String isim:hedefDizisi){
            System.out.println(isim);
        }
    }
}
