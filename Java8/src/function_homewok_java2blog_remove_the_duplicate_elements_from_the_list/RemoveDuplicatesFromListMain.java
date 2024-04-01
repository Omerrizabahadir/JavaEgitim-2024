package function_homewok_java2blog_remove_the_duplicate_elements_from_the_list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromListMain {
    /*
    Given the list of numbers, remove the duplicate elements from the list.
     */


    public static void main(String[] args) {
        //verilen dizi
        Integer[] arr = new Integer[]{1, 2, 3, 4, 3, 2, 4, 2};
        //diziyi listeledi
        List<Integer> listWithDuplicate = Arrays.asList(arr);
        //listedeki yinelenen sayıları çıkardı
        List<Integer> listWithoutDuplicate = Arrays.stream(arr).distinct().toList();
        System.out.println("List Without Duplicate numbers :"+listWithoutDuplicate.stream().distinct().collect(Collectors.toList()));
    }

}
