package singleton_design_pattern_thread_safe;

public class SingletonThreadSafe {

    // static varible,private constructor, ve static method aynı lazy ile
    //lazy'den tek farkı metoda syncronized eklenecek

    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {

    }
    public static synchronized SingletonThreadSafe getInstance(){
if (instance==null){
    instance =new SingletonThreadSafe();
}
        return instance;
    }
}
