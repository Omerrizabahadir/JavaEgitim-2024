package class_studies_abstruct_class_18_feb_02;

public class Daire extends Sekil{
    private double yariCap;

    Daire(double yariCap){
        this.yariCap=yariCap;

    }

    @Override
    double alanHesapla() {
        return Math.PI*yariCap*yariCap;
    }
}
