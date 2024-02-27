package class_studies_abstruct_class_18_feb_02;

public class Dikdortgen extends Sekil{
   private double uzunluk;
   private double genislik;

   Dikdortgen(double uzunluk,double genislik){
       this.genislik=genislik;
       this.uzunluk=uzunluk;
   }

    @Override
    double alanHesapla() {

        return uzunluk*genislik;
    }
}
