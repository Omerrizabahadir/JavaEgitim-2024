package singleton_design_pattern_eager;

public class SingletonEagerExample {

    //burada nesneyi oluşturduk.Artık çağırmamıza gerek yok nesneyi oluşturdu.
    private static SingletonEagerExample instance = new SingletonEagerExample();

    private SingletonEagerExample() {
    }

    public static SingletonEagerExample getInstance() {
        return instance;
    }
    public void printHello(String name){
        System.out.println("hello "+name);
    }
}
