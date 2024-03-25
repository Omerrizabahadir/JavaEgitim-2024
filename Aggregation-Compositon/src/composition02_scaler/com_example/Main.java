package composition02_scaler.com_example;

public class Main {
    public static void main(String[] args) {
        College college1 = new College("MIB");
        college1.setStudentList();
        college1=null;

        Student student=new Student("Mary");
        System.out.println(student.toString());


    }
}

