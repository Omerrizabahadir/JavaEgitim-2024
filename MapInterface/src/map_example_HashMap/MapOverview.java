package map_example_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapOverview {
    public static void main(String[] args) {
        Map<String,String>countryCodeMap=new HashMap<>();
        countryCodeMap.put("US","United States");
        countryCodeMap.put("BR","Brazil");
        countryCodeMap.put("ES","Spain");

        countryCodeMap.get("BR");
        System.out.println("HashMap : "+countryCodeMap);

        TreeMap<String,String> treemap=new TreeMap<>();

        treemap.put("D","Germany");
        treemap.put("N","Norway");

        System.out.println("Treemap : "+treemap);

        countryCodeMap.putAll(treemap);
        System.out.println("HashMap ' e TreeMap ekledik : "+countryCodeMap);
    }
}
