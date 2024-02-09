package access_specifiers;

import protected_examples.ProtectedMethodExample;

public class ProtectedAccessSpecifiersExample01 {
    public static void main(String[] args) {

        //bu access_specifiers paketimden  ProtectedAccessSpecifiersExample01
        // sınıftan protected_example paketi içerisindeki ProtectedMethodExample
        //sınıfına erişilebilir mi onu kontrol edicem

        ProtectedMethodExample protectedMethodExample = new ProtectedMethodExample();
        //protectedMethodExample.
    /*erişilemez protected olduğu için. farklı pakete izin vermez
       protected aynı paketten farklı sınıflara erişime izin verir
        */




    }

    public static record PrivateMethodExample01() {
        public static void main(String[] args) {



        }
        private int topla(int number1, int number2) {
            return number1 + number2;
        }
    }
}
