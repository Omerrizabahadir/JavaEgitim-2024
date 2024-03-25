package composition03;

public class Main {
    public static void main(String[] args) {
    Ogrenci ogrenci=new Ogrenci("Bahadır","sevim","1234","Aslan","Emine","30.02.1998");

        System.out.println(ogrenci.ad);
        System.out.println(ogrenci.soyAd);
        System.out.println(ogrenci.no);
        System.out.println(ogrenci.anaAdi);
        System.out.println(ogrenci.babaAdi);

        OgrenciIsleri ogrenciIsleri=new OgrenciIsleri(ogrenci);
        ogrenciIsleri.ekle();
    }
}
