package functional_interface.functional_interface_05;

import java.util.List;

@FunctionalInterface
public interface NumberListProcessor {
    int process(List<Integer> numbers);
}
