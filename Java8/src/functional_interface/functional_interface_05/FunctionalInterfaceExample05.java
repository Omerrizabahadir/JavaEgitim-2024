package functional_interface.functional_interface_05;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceExample05 {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,5,6);

        //Yukardaki Listenin sayılarını numList'e koyduk
        //for ile yeni listemi numList'i geziyor ve topluyor
        NumberListProcessor sumCalculator=numList ->{
            int sum=0;
            for (int num:numList){
                sum+=num;
            }
            return sum;
        };
        int totalSum = sumCalculator.process(numbers);
        System.out.println("Total sum : "+totalSum);



        System.out.println("Functional Interface olmadan Processor sınıfı ile ");

        //Processor'a göre yapılışı
        List<Integer> sayilar=Arrays.asList(1,2,3,4,5,6);

        Processor processor = new Processor();
        System.out.println("Listedeki sayıların toplamı :"+processor.process(numbers));


    }
}
