package singleton_design_pattern_thread_safe;

public class Main {
    public static void main(String[] args) {

        Thread thread1=new Thread(() ->{
           SingletonThreadSafe singletonThreadSafe=SingletonThreadSafe.getInstance();
            System.out.println("thread 1 singleton instance created ");
        });

        Thread thread2=new Thread(() ->{
            SingletonThreadSafe singletonThreadSafe=SingletonThreadSafe.getInstance();
            System.out.println("thread 2 singleton instance created ");
        });


        thread1.start();
        thread2.start();

        //bu thread1 ve thread2'den hangisi önce girerse o çalışır

    }
}
