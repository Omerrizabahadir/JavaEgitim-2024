package function_homewok_java2blog_Given_the_list_of_employee_group_them_by_employee_name;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private  String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static List<Employee> createEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee("John", 21);
        Employee e2 = new Employee("Martin", 19);
        Employee e3 = new Employee("Mary", 31);
        Employee e4 = new Employee("Mary", 18);
        Employee e5 = new Employee("John", 26);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        return employeeList;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
