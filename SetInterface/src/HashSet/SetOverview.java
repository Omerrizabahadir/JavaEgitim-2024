package HashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetOverview {

        public static void main(String[] args) {
            //List yinelenen değerleri kabul ediliyor
            List<Integer> numberList = new ArrayList<>();
            numberList.add(1);
            numberList.add(1);
            numberList.add(1);
            numberList.add(3);
            numberList.add(2);
            numberList.add(2);
            numberList.add(null);
            numberList.add(null);

            System.out.println("Number of array list : ");
            System.out.println(numberList);

            //Set'lerde key birden fazla aynı olamaz,Yinelenen değer kabul etmez

            Set<Integer> numberOfSetList = new LinkedHashSet<>();
            numberOfSetList.add(1);
            numberOfSetList.add(1);
            numberOfSetList.add(1);
            numberOfSetList.add(3);
            numberOfSetList.add(2);
            numberOfSetList.add(2);
            numberOfSetList.add(null);
            numberOfSetList.add(null);

            System.out.println("Set list : ");
            System.out.println(numberOfSetList);


        }
}