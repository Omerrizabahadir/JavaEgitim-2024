package thread_example04_synchronizedkullanmadannewile2threadoluşşturma;

import java.util.Arrays;
import java.util.Random;

public class ThreadSumExample {
    public static void main(String[] args) {
        int[] numbers = generateNumbersArray(100);
        int[] firstHalf = Arrays.copyOfRange(numbers, 0, numbers.length / 2);
        int[] secondHalf = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length);

        //new ile oluşturduğumuzda metotda synchronized anahtarına gerek yok
        //çünkü new ile oluşturulan farklı nesneler birbirine karışmaz
        //new ile farklı farklı oluşturmadığında synchronized kullanırsın
        SumThread firstThread = new SumThread(firstHalf);
        SumThread secondThread = new SumThread(secondHalf);

        firstThread.start();;
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int totalSum=firstThread.getSum()+secondThread.getSum();
        System.out.println("Toplam sonuç : "+totalSum);
    }

    public static int[] generateNumbersArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}
