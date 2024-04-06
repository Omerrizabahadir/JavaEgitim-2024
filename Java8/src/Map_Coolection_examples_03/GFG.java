package Map_Coolection_examples_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG {
    /*
    kullanıcı listesini
    UserId'in anahtar ve User'ın değer olduğu bir haritaya dönüştüreceğiz.
     */
    public static void main(String[] args) {
        User user1=new User(1,"User 1","Pune");
        User user2=new User(2,"User 2","Mumbai");
        User user3=new User(3,"User 3","Nagpur");



        System.out.println(User.toMap(user1,user2,user3));

    }
}
