package java8_homework_06;

import java.util.Comparator;
import java.util.Date;

public class Book {

    private int date;
    private String name ;

    public Book(int date, String name) {
        this.date = date;
        this.name=name;

    }

    public String getName() {
        return name;
    }


    public int getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

}
