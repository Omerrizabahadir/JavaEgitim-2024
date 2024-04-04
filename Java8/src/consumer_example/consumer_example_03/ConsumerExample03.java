package consumer_example.consumer_example_03;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample03 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Consumer<Integer> divideByTwo = number -> {
        System.out.println(number+" divided by 2 is : "+((double)number/2));
        };
        numbers.stream().forEach(divideByTwo);
        //veya direct forEaach () te olur    numbers.forEach(divideByTwo);
    }
}
