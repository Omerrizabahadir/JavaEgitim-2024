package thread_homework_02;

import java.util.concurrent.atomic.AtomicInteger;

public class ParallelSumExample {
    /*Aşağıdaki ödevde, öğrencilere birden fazla thread kullanarak sayıları toplayan bir program kodlayınız.
    "Verilen bir dizideki sayıları paralel olarak toplayan bir Java programı geliştirin.
     Programın çalışma mantığı şu şekilde olmalıdır:
     İlk önce bir dizi oluşturun ve ardından diziyi belirli sayıda thread ile paralel olarak böleceksiniz.
     Her thread, kendi böldüğü bölümdeki sayıları toplayacak ve sonuçları ana toplam sonucuna ekleyecektir."
    */
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numberOfThreads = 4;
        AtomicInteger totalSum = new AtomicInteger(0);

        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            final int startIndex = i * numbers.length / numberOfThreads;
            final int endIndex = (i + 1) * numbers.length / numberOfThreads;

            threads[i] = new Thread(() -> {
                int localSum = 0;
                for (int j = startIndex; j < endIndex; j++) {
                    localSum += numbers[j];
                }
                totalSum.addAndGet(localSum);
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total Sum: " + totalSum.get());
    }
}
