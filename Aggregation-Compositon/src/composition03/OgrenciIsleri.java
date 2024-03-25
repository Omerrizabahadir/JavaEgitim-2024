package composition03;

public class OgrenciIsleri {
    private  Ogrenci ogrenci;
    public OgrenciIsleri(Ogrenci ogrenci) {
        this.ogrenci=ogrenci;
    }
    public void ekle(){
        System.out.println("Öğrenci eklendi :"+ogrenci.ad);
    }
    public void sil(){
        System.out.println("Öğrenci silindi :"+ogrenci.no);
    }
    public void bilgileriGoster(){
        System.out.println(ogrenci.ad);
        System.out.println(ogrenci.soyAd);
        System.out.println(ogrenci.no);
        System.out.println(ogrenci.anaAdi);
        System.out.println(ogrenci.babaAdi);
    }
}
