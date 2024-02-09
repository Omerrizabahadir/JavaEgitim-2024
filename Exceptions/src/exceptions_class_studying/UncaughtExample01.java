package exceptions_class_studying;

public class UncaughtExample01 {

   // try catch olmayan metodlar uncaughtexception hatası  verir
    //ve try catch bloğu olan metoda doğru sondan başa
    // metodlar çöker sadece try catch olan metod çalışır

    public static void main(String[] args) {
      UncaughtExample01 uncaughtExample01=new UncaughtExample01();
        String name=null;
        uncaughtExample01.method1(name);


    }
    public void method1(String name){
        System.out.println("method1");
        try{
            method2(name);
        }catch (NullPointerException nullPointerException){
            System.out.println("NullPointerException catch");
        }
        System.out.println("method1 work");
    }
    public  void  method2(String name){
        System.out.println("method2");
        method3(name);
        System.out.println("method2 not work");
    }
    public void method3(String name) {
        System.out.println("method3");

            name.toLowerCase();
            System.out.println("method3 not work");

    }
    }

