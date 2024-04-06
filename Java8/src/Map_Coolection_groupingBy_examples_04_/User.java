package Map_Coolection_groupingBy_examples_04_;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class User {
    private int userId;
    private String name;
    private String city;

    public User(int userId, String name, String city) {
        this.userId = userId;
        this.name = name;
        this.city = city;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static Map toMap(User user1, User user2, User user3, User user4, User user5) {
        Map<String, List<User>>
                cityUserListMap
                = asList(user1, user2, user3,
                user4, user5)
                .stream()
                .collect(Collectors.groupingBy(User::getCity)); //ilk şehir yazıp kullanıcıları buna göre gruplayacak

        return cityUserListMap;
    }


}
