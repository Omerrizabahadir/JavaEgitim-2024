package thread_example03;

public class SynchronizedExample {

    private int count = 0;

    /*synchronized anahtarını metotta kullanınca 1'den 1000'e kadar thread1 'i sırayla basar
    thread2 'yide 1000'den 2000'e kadar sırayla basar. senkronize olduğu için thread1 bitince thread2 ye geçer
    Eğer synchronized yoksa sıralamayı bozup basar , data kaybıda olabilir
     */
    public synchronized void increment() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        SynchronizedExample synchronizedExample = new SynchronizedExample();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedExample.increment();
            }
        });

        Thread thread2=new Thread(()->{
            for (int i=0;i<1000;i++){
                synchronizedExample.increment();
            }
        });
        thread1.start();
        thread2.start();

        try {
            //join kullanınca thtread 'i bekler. mutlaka kullanmalıyız
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("sonuç : "+synchronizedExample.count);


    }
}