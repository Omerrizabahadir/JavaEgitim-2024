package void_methods;

public class VoidMethodExample01 {
    public static void main(String[] args) {


        sayHello1("hello");

        sayHello2();
        sayiVer1();


        int sayi = sayiVer2();
        // int sayi2=sayiVer1();   void olduğu için alamıyorum
    }

    public static String sayHello1(String mesaj) {
        System.out.println(mesaj);
        return mesaj;
    }

    public static void sayHello2() {
        System.out.println("Hoş geldiniz...!!!");
    }

    public static void sayiVer1() {
        System.out.println("123");
    }

    public static int sayiVer2() {
        System.out.println();

        return sayiVer2();
    }


}