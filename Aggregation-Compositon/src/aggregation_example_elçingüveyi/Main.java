package aggregation_example_elçingüveyi;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        Student student1 = new Student("1", "Ali ");
        Student student2 = new Student("2", "Alp ");
        Student student3 = new Student("3", "Ece ");


        classroom.studentAdd(student1);
        classroom.studentAdd(student2);
        classroom.studentAdd(student3);


        System.out.println(classroom);
        System.out.println(student2);

        classroom = null;  //classroom null olsa dahi students ' a erişebiliriz. LOOSE COUPLİNG gevşek bağlı oldukları için
        System.out.println(classroom);

        System.out.println(student3);
    }
}
