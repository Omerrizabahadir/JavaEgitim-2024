package Map_Coolection_examples_03;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

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

    public static Map toMap(User user1, User user2, User user3) {

        Map<Integer,User>userMap= Arrays.asList(user1,user2,user3)
                .stream()
                .collect(Collectors.toMap(p->p.getUserId(),p->p));
        return userMap;
    }
}
