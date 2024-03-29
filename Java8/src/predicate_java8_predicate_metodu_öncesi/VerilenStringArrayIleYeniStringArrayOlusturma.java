package predicate_java8_predicate_metodu_öncesi;

public class VerilenStringArrayIleYeniStringArrayOlusturma {
    public static void main(String[] args) {
        String[] kaynakDizi = {"Ali", "Ayşe", "Adnan", "Ece", "Ümit", "Beste"};


        //for ile kaynak dizisini oluşturma
        System.out.println("Kaynak dizimiz : ");
        for (String isim : kaynakDizi) {
            System.out.println(isim);

        }
        //yeni dizi oluşturma
        String[] hedefDizi = new String[kaynakDizi.length];
        for (int i = 0; i < hedefDizi.length; i++) {
            hedefDizi[i] = kaynakDizi[i];
        }
        //yeni diziyi ekrana yazdırma

        System.out.println("hedef dizimiz : ");
        for (String isim : kaynakDizi) {
            System.out.println(isim);
        }
    }
}
