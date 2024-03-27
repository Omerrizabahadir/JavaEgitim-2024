package thread_example05;

/*
örnekte, iki farklı thread oluşturulmuş ve Runnable arayüzü ile görevler atanmıştır.
İlk thread 1 saniye bekleme süresiyle, ikinci thread ise 0.7 saniye bekleme süresiyle çalışır.
Thread'lerin çalışma süreleri farklı olduğu için çıktıda bu fark görülebilir.
main classın’da ise thread'lerin işlemlerinin tamamlanmasını beklemek için join() metodları kullanılmıştır.
Bu sayede ana thread, diğer thread'lerin işlemlerini tamamlamadan sonlandırılmaz.
 */

public class ThreadExample05 {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Thread 1 count : " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable task2 = ()->{
            for (int i=0;i<=5;i++){
                System.out.println("Thread 2 count:  "+i);

                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1=new Thread(task1);
        Thread thread2=new Thread(task2);


        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("main thread sonlandı");
    }
}
