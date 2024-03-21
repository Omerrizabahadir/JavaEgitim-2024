package singleton_design_pattern_eager;

public class Main {
    public static void main(String[] args) {

        SingletonEagerExample singletonEagerExample=SingletonEagerExample.getInstance();
        singletonEagerExample.printHello("Bilgeadam");
    }
}
