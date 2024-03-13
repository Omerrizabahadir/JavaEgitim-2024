package map_example_WeakHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample01 {
    public static void main(String[] args) {
        //HashMap<String,Integer>numbers=new HashMap<>();
        Map<String, Integer> numbers = new WeakHashMap<>();
        /*WeakHashMap kullandığımızda eğer referans null ise( two=null)
        garbage collector bu değeri weakhashmp içerisinden otomatik kaldırır(remove)
         */

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        //insert elements to the WeakHashMap list

        numbers.put(two, 2);
        numbers.put(four, 4);
        System.out.println("inserting elements : " + numbers);

        //insert null in WeakHashMap list
        two = null;

        //two null old için garbace collector ile null olan değeri çöpe attı
        System.gc();
        System.out.println("WeakHashMap after garbage collection : " + numbers);
    }
}
