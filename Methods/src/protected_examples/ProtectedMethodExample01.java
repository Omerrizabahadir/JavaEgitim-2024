package protected_examples;

public class ProtectedMethodExample01 {

    public static void main(String[] args) {
         /*protected aynı paketteki farklı sınıfa eriştirir
        ProtectedMethodExample aynı pakette old için erişebilir
         */

        ProtectedMethodExample protectedMethodExample=new ProtectedMethodExample();
        System.out.println(protectedMethodExample.topla(3,7));
    }
}
