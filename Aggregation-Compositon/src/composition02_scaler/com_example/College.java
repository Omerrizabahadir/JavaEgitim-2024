package composition02_scaler.com_example;

import java.util.ArrayList;
import java.util.List;

public class College {

    private String name;
    ArrayList<Student> studentList;

    public College(String name) {

        this.name = name;
    }

    public String getName() {

        return this.name;
    }


    public List<String> getStudentList() {
        List<Student> students = this.studentList;
        List<String> names = new ArrayList<>();
        for (Student student : students) {
            names.add(student.getName());
        }
        return names;
    }

    public void setStudentList() {
        Student student1 = new Student("Abe");
        Student student2 = new Student("lincoln");
        Student student3 = new Student("Abraham");
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        this.studentList = students;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}

 class Student {
    private String name;

    public Student(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

