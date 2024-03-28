package functional_interface_03_java_lang_Object;

@FunctionalInterface
public interface Sprint {

    public boolean equals(Object obj);

    public String toString();


    /*
    Yukardaki abstract metotlar java.lang.Object sınıfından geldiği için
    istediğin kadar metot yaz bular FunctionalInterface'e dahil değil
    FunctionalInterface olması için mutlaka kendim en az ve en çok 1 adet abstract metot yazmalıyım
    Burada yazmadığım için Compiler hatası veriyor
     */


    public void make();  //abstract metodu kendim yazınca hata kalakar
}
