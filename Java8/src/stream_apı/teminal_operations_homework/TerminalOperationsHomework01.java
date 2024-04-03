package stream_apı.teminal_operations_homework;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TerminalOperationsHomework01 {
    public static void main(String[] args) {

        Map<Integer,String>map=new HashMap<>();

        map.put(1,"ali");
        map.put(2,"ece");
        map.put(3,"can");
        map.put(4,"cem");

        map.forEach((name,id)->System.out.println("Id : "+id+"\tName: "+name));

         /*
        Anahtara yeni değer atama
         */
        System.out.println(map.computeIfAbsent(5,value->value+"seda"));


        /*
        merge()
         */
        System.out.println(map.merge(1,"Bora",(oldValue,newValue)->oldValue.concat(" ve ").concat(newValue)));



    }
}
