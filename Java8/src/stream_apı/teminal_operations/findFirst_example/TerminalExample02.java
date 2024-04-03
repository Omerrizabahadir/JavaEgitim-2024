package stream_apı.teminal_operations.findFirst_example;

import java.util.List;
import java.util.Optional;

public class TerminalExample02 {
    public static void main(String[] args) {

        // DoubleStream filter(DoublePredicate predicate);
        Optional<Double> temprature = List.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2)
                .stream()
                .filter(temp -> temp > 0)
                .findFirst();
        System.out.println(temprature);

// DoubleStream filter(DoublePredicate predicate);
        Optional<Double> temperature2 = List.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2)
                .stream()
                .filter(temp -> temp > 0)
                .findAny();  //ilkini vereceği garanti değil

        System.out.println(temperature2);
    }
}
