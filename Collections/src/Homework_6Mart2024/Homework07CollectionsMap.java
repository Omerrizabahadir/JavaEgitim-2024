package Homework_6Mart2024;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework07CollectionsMap {
    /*
    Map--
    Bir Map oluşturun ve bu mape 5 farklı anahtar-değer çifti ekleyin. Örneğin, öğrenci adları ve notları gibi çiftler kullanabilirsiniz.
    -Map'in boyutunu ekrana yazdırın.
    -Map'in tüm anahtar-değer çiftlerini ekrana yazdırın.
    -Kullanıcıdan bir anahtar girmesini isteyin ve bu anahtarın karşılık gelen değerini ekrana yazdırın.
    -Kullanıcıdan yeni bir anahtar ve değer çifti girmesini isteyin ve bu çifti mape ekleyin.
    -Map'in tüm anahtarlarını ekrana yazdırın.
    -------Kullanıcıdan bir değer girmesini isteyin ve bu değerin Map içinde bulunan kaç farklı anahtarla ilişkilendiğini bulun ve ekrana yazdırın.
    -Map'ten bir anahtarın değerini güncelleyin.
    -Map'ten bir anahtarı silin ve güncellenmiş Map'i ekrana yazdırın.
    -Map'i temizleyin (tüm anahtar-değer çiftlerini silin) ve boş Map durumunu ekrana yazdırın.
    -Kullanıcıdan yeni anahtar-değer çiftleri eklemesini isteyin ve bu çiftleri mape ekleyerek sonucu ekrana yazdırın.
     */
    public static void main(String[] args) {


        Map<String, Integer> studentsPoints = new HashMap<>();

        studentsPoints.put("Ahmet", 65);
        studentsPoints.put("Veli", 40);
        studentsPoints.put("Neşe", 90);
        studentsPoints.put("Baran", 85);
        studentsPoints.put("Buket", 50);

        System.out.println("HashMap list size is : " + studentsPoints.size());
        System.out.println("HashMap list is : " + studentsPoints);

        System.out.println("---------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a key from the list : ");
        String keyFromUser1 = scanner.next();
        System.out.println(keyFromUser1 + "'s point is : " + studentsPoints.get(keyFromUser1));
        System.out.println("----------------------");
        System.out.println("Please write a new key and value for the list : ");
        String newKeyFromUser = scanner.next();
        int newValueFromUser = scanner.nextInt();
        studentsPoints.put(newKeyFromUser, newValueFromUser);
        System.out.println("New Key and new value added from user to the list : " + studentsPoints);

        System.out.println("----------------------");

        System.out.println("HashMap's Keys are :" + studentsPoints.keySet());

        System.out.println("----------------------");

        System.out.println("Please write a Key in the HashMap :");
        String keyGivingFromUser = scanner.next();
        int counter = 0;
        for (String Key : studentsPoints.keySet()) {
            if (Key.equals(keyGivingFromUser)){
            counter++;
            }
        }
        System.out.println(keyGivingFromUser+" is repeating "+counter+" time(s)");

        System.out.println("----------------------");
        System.out.println("Is Baran's new point updated  : " + studentsPoints.replace("Baran", 85, 99));

        System.out.println("After updating HashMapList is :" + studentsPoints);

        System.out.println("-----------------------");
        studentsPoints.remove("Baran");
        System.out.println("After removing Baran, new list is : " + studentsPoints);

        System.out.println("-----------------------");
        studentsPoints.clear();
        System.out.println("After removing all elements from the list :" + studentsPoints);
        System.out.println("-----------------------");

        Map<String, Integer> newList = new HashMap<>();

        System.out.println("Please add new Keys and new values for new list :");
        System.out.println("How many keys and values do u want to adding ? ");
        int addingNewElementsFromUsers = scanner.nextInt();

        for (int i = 0; i < addingNewElementsFromUsers; i++) {
            System.out.println("Please write a key and value");
            String addingNewElementsFromUsersKey = scanner.next();
            int addingNewElementsFromUsersValue = scanner.nextInt();
            newList.put(addingNewElementsFromUsersKey, addingNewElementsFromUsersValue);
        }

        System.out.println("New list is adding from the user : " + newList);
    }

}
