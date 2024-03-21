package singleton_design_pattern_lazy;

public class SingletonLazyExample {

    //Singleton'da--> nesne class ismiyle aynı olacak ve private ve static olacak
    private static SingletonLazyExample instance;

    //Constructor private olacak. böylece main de hiçbir zaman new ile üretip nesneyi çağıramayız
    private SingletonLazyExample() {

    }

    //metot static olacak
    public static SingletonLazyExample getInstance() {
        if (instance == null) {
            instance = new SingletonLazyExample();//instance başlangıçta null du. ama artık new ile ürettik null değil
        }

        return instance;
    }

    public void printHello(String name) {
        System.out.println("hello "+name);
    }
}
