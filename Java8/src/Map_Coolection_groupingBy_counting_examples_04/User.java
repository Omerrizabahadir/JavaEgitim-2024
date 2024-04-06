package Map_Coolection_groupingBy_counting_examples_04;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class User {
    private int userId;
    private String name;
    private String city;

    // Constructor
    public User(int userId, String name,
                String city) {
        this.userId = userId;
        this.name = name;
        this.city = city;
    }

    // Getter functions
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    // Overriding the toString() method
    // to create a custom function
    @Override
    public String toString() {
        return "User [userId = "
                + userId + ", name = "
                + name + ", city = "
                + city + "]";
    }

    public static Map toMap(User user1,
                            User user2,
                            User user3,
                            User user4,
                            User user5) {

        Map<String, Long> cityUserCountMap = Arrays.asList(user1, user2, user3,
                        user4, user5)
                .stream()
                .collect(Collectors.groupingBy(User::getCity, Collectors.counting())); //şehire göre sıralar ve kaç kişi o şehirde ise onu yazar

        return cityUserCountMap;
    }

}






