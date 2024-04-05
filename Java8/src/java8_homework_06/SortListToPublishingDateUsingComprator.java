package java8_homework_06;

import java.util.*;

public class SortListToPublishingDateUsingComprator {
  /*
    6-Bir listeyi belirli bir özelliğe göre sıralamak için
    Comparator kullanarak bir program yazın.
    Örneğin, bir kitap listesini yayın tarihine göre sıralayın.
   */

    public static void main(String[] args) {


        Book book1 = new Book(1859, "İki Şehrin Hikayesi");
        Book book2 = new Book(1943, "Küçük Prens");
        Book book3 = new Book(1997, "Harry Potter ve Felsefe Taşı");
        Book book4 = new Book(1937, "Hobbit");

        List<Book> worldMostSellerList = new ArrayList<>();
        worldMostSellerList.add(book1);
        worldMostSellerList.add(book2);
        worldMostSellerList.add(book3);
        worldMostSellerList.add(book4);
        System.out.println(worldMostSellerList);

        worldMostSellerList
                .stream()
                .sorted(Comparator.comparing(Book::getDate).thenComparing(Book::getName))
                .forEach(book -> System.out.println(book.getDate() + " - " + book.getName()));


    }

}
