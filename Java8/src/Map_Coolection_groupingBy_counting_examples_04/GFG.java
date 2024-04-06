package Map_Coolection_groupingBy_counting_examples_04;

public class GFG {
    public static void main(String[] args) {

        /*
        groupingBy() metodu kullanarak şehre göre listeleme ve o şehirde kaç kişi var haritalama
         */

        User user1 = new User(1, "User1", "Pune");
        User user2 = new User(2, "User2", "Mumbai");
        User user3 = new User(3, "User3", "Nagpur");
        User user4 = new User(4, "User4", "Pune");
        User user5 = new User(5, "User5", "Mumbai");

        System.out.println(User.toMap(user1,user2,user3,user4,user5));
    }
}
