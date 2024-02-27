package class_studies_abstruct_class_18_feb_02;

public class Main {
    public static void main(String[] args) {

        Dikdortgen dikdortgen=new Dikdortgen(5,3);
        System.out.println("Dikdörtgenin Alanı : "+dikdortgen.alanHesapla());
        dikdortgen.yazdir();


        System.out.println("-----------");


        Daire daire=new Daire(4);
        System.out.println("Dairenin Alanı : "+daire.alanHesapla());
        daire.yazdir();
    }
}
