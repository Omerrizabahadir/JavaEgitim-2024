package predicate_java8_predicate_metodu_öncesi;

public class FindLetterStartWithHToTheList {
    public static void main(String[] args) {

        /*
        Jva8 predicate den önce böyle kullanılıyorduk
         */

        String[] kaynakDizi = {"Java8", "hasan", "kadir", "demircan", "hello"};

        String[] hedefDizi = new String[kaynakDizi.length];

        int hIleBaslayanKelimelerinSayisi = 0;

        //kaynakDiziyi yazdırma
        for (String kelime : kaynakDizi) {
            if (kelime.startsWith("h")) {
                hIleBaslayanKelimelerinSayisi++;
            }
        }

        //h ile başlayan kelimelerin olduğu diziyi pluşturma
        String[] hIleBaslayanKelimelerinListesi = new String[hIleBaslayanKelimelerinSayisi];
        int index = 0;

        for (String kelime1 : kaynakDizi) {
            if (kelime1.startsWith("h")) {
                hIleBaslayanKelimelerinListesi[index] = kelime1;
                index++;
            }
        }
        //h ile başlayanları ekrana yazdırma
        System.out.println("h ile başlayanlar : ");
        for (String kelime2 : hIleBaslayanKelimelerinListesi) {
            System.out.println(kelime2);
        }
    }
}

