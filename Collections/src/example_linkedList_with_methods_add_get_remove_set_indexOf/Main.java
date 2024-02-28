package example_linkedList_with_methods_add_get_remove_set_indexOf;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
       LinkedList<String> animals = new LinkedList<>();

        System.out.println("------------add method---------");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");

        System.out.println("------------get method---------");
        //get elements to the ArrayList
        String str = animals.get(0);
        System.out.println("Elements of index : " + str);


        //using set method-->change the elements of the array list
        System.out.println("------------set method---------");

        animals.set(2, "Fish");
        System.out.println("2'nd elements changed : " + animals);


        //remove element from index 2
        System.out.println("------------remove method---------");

        animals.remove(2);
        System.out.println("Remove element 2 : " + animals);


        //size-->give the array list length
        System.out.println("------------size method---------");

        int size = animals.size();
        System.out.println("Size of the animal list is : " + size);

        System.out.println("------------sort method---------");
        animals.sort(Comparator.reverseOrder());//yerlerini ters çevirdi
        animals.sort(Comparator.naturalOrder());//ilk düzende sıraladı
        System.out.println("Sorted ArrayList :" + animals);


        System.out.println("------------clone method---------");
        System.out.println("2'nd ArrayList : " + animals.clone());

        System.out.println("------------contains method---------");

        Boolean b = animals.contains("Cat");
        System.out.println("Cat elementini ArrayListte var mı : " + b);

        System.out.println("------------indexOf method---------");

        //indexOf () yöntemi, belirtilen öğenin bu listede ilk geçtiği yerin dizinini veya bu liste öğeyi içermiyorsa -1 değerini döndürür.
        int indexOf = animals.indexOf("Cat");
        System.out.println("Cat in indexi : "+indexOf);
        //0 indexte olmadığında -1 döndürür. yani bu elemandan yoktur
        int idexOf1 =animals.indexOf(0);
        System.out.println("0 hangi indexte : "+idexOf1);


    }
}

