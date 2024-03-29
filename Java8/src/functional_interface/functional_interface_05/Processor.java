package functional_interface.functional_interface_05;

import java.util.List;

//FunctionalInteface olmasaydı böyle yapacaktık. Maindede Processor'u çağıracaktık

public class Processor implements NumberListProcessor {
    @Override
    public int process(List<Integer> numbers) {

        int sum=0;
        for (int num: numbers){
            sum+=num;
        }

        return sum;
    }





}
