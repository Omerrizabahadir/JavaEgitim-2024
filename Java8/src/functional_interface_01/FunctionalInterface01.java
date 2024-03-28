package functional_interface_01;

@FunctionalInterface
public interface FunctionalInterface01 {
    public void abstractMethod();

    /*
    @FunctionalInterface interface'in üzerine konulmalıdır.
    Functional Interface sadece en az ve en çok 1 adet abstract method kullanmalısın
    yalnız;
    java.lang.Object sınıfındaki metod varsa istediğin kadar kullanabilirsin sınır yok
    önemli olan yazdığın abstract metod 1 adet olmalı
    1'den az veya fazla olursa Compiler Hatası verir
     */

    //public void abstractMethod2();  //olmaz sadece 1 adet abstract method yazabilirim
}
