package functional_interface_02;
@FunctionalInterface
public interface SubInterface extends FunctionalInterface {


    //public void run();

    /*
     super interface'de(FunctionalInterface) 1 adet abstract method varsa, yenisi bir abstract method ekleyemeyiz.
     sub interface  ve super interface varsa. bunda da sadece 1 adet abstract metot kullanmalıyız. 1 den az yada 1 den çok olursa
     Compiler Hatası verir
     */
}
