package stream_apı.source_example;

import javax.crypto.spec.PSource;
import java.util.stream.IntStream;

public class SourceExample02 {
    public static void main(String[] args) {
        IntStream.iterate(10,i->i+5)  //source
                .limit(6)  //intermediate operations
                .forEach(System.out::println); //terminel operations
    }
}
