package map_example_HashMap;


import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;


public class HashMapExample01 {

    public static void main(String[] args) {

        //Map<key, value>numbers=new HashMap()
        Map<String, List<String>> countryCityMap = new HashMap<>();


        List<String> cityListOfTR = new LinkedList<>();
        cityListOfTR.add("ANKARA");
        cityListOfTR.add("İSTANBUL");
        cityListOfTR.add("ESKİŞEHİR");
        cityListOfTR.add("DENİZLİ");
        cityListOfTR.add("SİİRT");

        System.out.println(countryCityMap);

        countryCityMap.put("tr", cityListOfTR);
        System.out.println(countryCityMap);


        List<String> cityListA = new LinkedList<>();
        cityListA.add("A");
        cityListA.add("İ");
        cityListA.add("E");
        cityListA.add("D");
        cityListA.add("S");

        System.out.println(cityListA);
        System.out.println("şehirler :" + cityListOfTR + "Kodları : " + cityListA);

        List<String> cityListOfB = new LinkedList<>();
        cityListOfB.add("a");

        countryCityMap.put("b", cityListOfB);
        System.out.println(countryCityMap);
    }
}