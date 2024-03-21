package singleton_design_pattern_lazy;

public class Main {
    public static void main(String[] args) {
        //statik olduğu için metod new ile üretmeden çağırırız
        SingletonLazyExample singletonExample= SingletonLazyExample.getInstance();
        singletonExample.printHello("Burak");
    }

}
