package Map_Coolection_groupingBy_examples_04_;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.awt.*;
import java.util.Map;

import static java.util.Arrays.asList;

public class GFG {
    /*
    Map Collection'ınında groupingBy() metodu kullanarak
    şehre göre gruplama
     */

    public static void main(String[] args) {
        User user1 = new User(1, "User 1", "Pune");
        User user2 = new User(2, "User 2", "Mumbai");
        User user3 = new User(3, "User 3", "Nagpur");
        User user4 = new User(4, "User 4", "Pune");
        User user5 = new User(5, "User 5", "Mumbai");

        System.out.println(User.toMap(user1,user2,user3,user4,user5));

    }
}
