package stream_apı.intermediate_example_peek;

import java.util.List;
import java.util.stream.Collectors;

public class IntemediteExample01 {

    public static void main(String[] args) {


    //peek() işlem yapmıyor.yalnızca hata var mı bakıyor
    List<String>result=List.of("one","two","three","four")
            .stream()
            .filter(e->e.length()>3)
            .peek(e->System.out.println("Filtered value : "+e))
            .map(String::toUpperCase)
            .peek(e->System.out.println("Mapped value : "+e))
            //.toList();
            .collect(Collectors.toList());

}
}
