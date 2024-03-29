package stringdizi_olarakverilenden_a_harfiilebaşlayanları_Stringdizi_yapma;

public class StringDizideAHarfiIleBaslayanlariYeniStringDiziYapma {
    public static void main(String[] args) {

        String[] kaynakDizi = {"Ali", "Ayşe", "Fuat", "Özgür", "Ömer", "Önder"};
        int aIleBaslayanKelimelerinSayisi = 0;

        //   kaynakDiziyi yazdırma
        System.out.println("kaynak dizisi :");
        for (String isim : kaynakDizi) {
            System.out.println(isim);
            aIleBaslayanKelimelerinSayisi++;
        }
        //h ile başlayan kelimelerin olduğu diziyi pluşturma

        System.out.println("A Ile Baslayan Kelimelerin Listesi : ");
        String[] aIleBaslayanKelimelerinListesi = new String[aIleBaslayanKelimelerinSayisi];

        for (String isim1 : kaynakDizi) {
            if (isim1.startsWith("A")) {
                System.out.println("A ile başlayan isimler : " + isim1);

            }
        }

    }
}
/*String[] kaynakDizi = {"Java8", "hasan", "kadir", "demircan", "hello"};



int hIleBaslayanKelimelerinSayisi = 0;



//h ile başlayan kelimelerin olduğu diziyi pluşturma
String [] hIleBaslayanKelimelerinListesi=new String[hIleBaslayanKelimelerinSayisi];
int index=0;

        for (String kelime1:kaynakDizi){
        if (kelime1.startsWith("h")){
hIleBaslayanKelimelerinListesi[index]=kelime1;
index++;
        }
        }
        //h ile başlayanları ekrana yazdırma
        for (String kelime2:hIleBaslayanKelimelerinListesi) {
        System.out.println("h ile başlayanlar : " + kelime2);
        }

 */