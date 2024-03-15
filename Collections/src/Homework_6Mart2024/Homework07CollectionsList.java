package Homework_6Mart2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework07CollectionsList {
    /*
List Collections Ödevi :
Bir ArrayList oluşturun ve bu listeye 5 farklı öğe ekleyin.
ArrayList'in boyutunu ekrana yazdırın.
ArrayList'in tüm elemanlarını ekrana yazdırın.
ArrayList'e kullanıcıdan bir eleman eklemesini isteyin ve bu elemanı listenin sonuna ekleyin.
ArrayList'in tüm elemanlarını tekrar ekrana yazdırın.
Kullanıcıdan bir indeks değeri girmesini isteyin ve bu indeksteki elemanı ekrana yazdırın.
********Kullanıcıdan bir eleman girmesini isteyin ve bu elemanın ArrayList'te kaç defa geçtiğini bulun ve ekrana yazdırın.
ArrayList'in tamamını sıralayın ve sıralı listeyi ekrana yazdırın.
ArrayList'i temizleyin (tüm elemanları silin) ve boş liste durumunu ekrana yazdırın.
Kullanıcıdan yeni elemanlar eklemesini isteyin ve bu elemanları ArrayList'e ekleyerek sonucu ekrana yazdırın.
 */
    public static void main(String[] args) {
        List<String> tvBrands = new ArrayList<>();
        tvBrands.add("Samsung");
        tvBrands.add("LG");
        tvBrands.add("Arçelik");
        tvBrands.add("Vestel");
        tvBrands.add("LG");
        tvBrands.add("Philips");


        int size = tvBrands.size();
        System.out.println("Arraylist size is : " + size);

        System.out.println("---------------------");
        System.out.println("ArrayList elements are : " + tvBrands);
        System.out.println("-----------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write one of the new TV brand : ");
        String tvBrand = scanner.next();
        tvBrands.add(5, tvBrand);
        System.out.println("After adding Tv brand from user ,New ArrayList is : " + tvBrands);
        System.out.println("-----------------------");

        System.out.println("Please write an index value in the ArrayList : ");
        int indexValue = scanner.nextInt();
        tvBrands.get(indexValue);
        System.out.println(indexValue + " is " + tvBrands.get(indexValue));
        System.out.println("-----------------------");

        System.out.println("Please write an element in the ArrayList : ");
        String elementChosenFromUser = scanner.next();
        int counter = 0;
        for (int i = 0; i < tvBrands.size(); i++) {
            if (tvBrands.get(i).equals(elementChosenFromUser)) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " " + elementChosenFromUser + " element(s) in the list  ");

        System.out.println("-----------------------");

        System.out.println("ArrayList is : " + tvBrands);

        System.out.println("-----------------------");

        tvBrands.clear();
        System.out.println("After remove all elements : " + tvBrands);

        System.out.println("------------------------");

        List<String> newTvBrands = new ArrayList<>();

        System.out.println("Please make a new ArrayList : ");
        System.out.println("How many tv brand do you add to new list :");
        int addingTvBrandsFromUser = scanner.nextInt();
        for (int i = 0; i < addingTvBrandsFromUser; i++) {
            System.out.println("Please write a Tv Brand for new ArrayList :");
            String brandsGivingFromUser = scanner.next();
            newTvBrands.add(brandsGivingFromUser);
        }

        System.out.println("New Tv Brands adding elements from user : " + newTvBrands);

    }


}

