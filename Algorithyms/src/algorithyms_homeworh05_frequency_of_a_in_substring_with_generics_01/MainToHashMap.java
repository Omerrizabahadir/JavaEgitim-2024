package algorithyms_homeworh05_frequency_of_a_in_substring_with_generics_01;

import java.util.HashMap;

public class MainToHashMap {
    public static void main(String[] args) {

        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        String word = "abbcacbaba";
        for (int i = 0; i < word.length(); i++) {

            if (!hashMap.containsKey(word.charAt(i))) {
                hashMap.put(word.charAt(i), 1);

            } else {
                int count = (int) hashMap.get(word.charAt(i));
                hashMap.put(word.charAt(i), count + 1);
            }
        }

        System.out.println(hashMap.get("a harfinden " + 'a' + " adet vardır"));
        System.out.println(hashMap.get("b harfinden " + 'b' + " adet vardır"));
        System.out.println(hashMap.get("c harfinden " + 'c' + " adet vardır"));


    }
}
