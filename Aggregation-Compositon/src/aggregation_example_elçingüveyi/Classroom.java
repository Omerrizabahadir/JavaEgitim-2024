package aggregation_example_elçingüveyi;

import java.util.ArrayList;

public class Classroom {
    ArrayList<Student> students = new ArrayList<>();

    public void studentAdd(Student st) {
        students.add(st);
    }

    //Elle yazdık toString metodunu
    public String toString() {

        String str = " ";
        for (Student s : students) {
            str = str + "\nÖğrenci Adı :" + s.getName() + "Öğrenci no :" + s.getId();
        }

        return str;
    }
}
