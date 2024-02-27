package medium_com_sorulari;

import java.util.Random;

public class Soru3 {
    /*medium.com java algoritma soruları ve çözümleri
    Soru3: Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki
    tüm elemanların ortalamasını alacak programı geliştirin.
    Programı yazarken aşağıdaki özelliklere uygun yazınız.
    Rastgele oluşan 100 elemanlık sayı kümesi program yeniden her çalıştığında değişsin.
    Sabit elemanlı bir dizi vermeyin!
    Ortalama almayı sağlayacak kodu bir fonksiyon halinde tasarlayın.
    İçine diziyi girdi (input) olarak alsın.
    Ortalama alan fonksiyon ortalamayı ondalıklı sayı olarak döndürsün. (return) etsin.
     */
    public static void main(String[] args) {
        Soru3 soru3 = new Soru3();
        int[] dizi = new int[100];   //dizinin uzunluğunu 100 yap dedi
        soru3.randomSayilarDiziyeAl(dizi);
        soru3.dizininOrtalamasiniAl(dizi);

    }
    public int[] randomSayilarDiziyeAl(int[] dizi) {

        for (int i = 0; i <dizi.length; i++) {
            Random random = new Random();
            int sayi = random.nextInt(100) +1;
            dizi[i] = sayi;
            System.out.println(i+". sayı : "+sayi);
        }
        return dizi;
    }

    public int dizininOrtalamasiniAl(int[] dizi) {
        int toplam =0;
        for (int i = 0; i <dizi.length; i++) {
            toplam +=dizi[i];
        }
        System.out.println("Dizi sayıları toplamı : "+toplam);
        System.out.println("Dizi sayıları ortalaması : "+(double)toplam/dizi.length);

        return toplam;
    }
}

