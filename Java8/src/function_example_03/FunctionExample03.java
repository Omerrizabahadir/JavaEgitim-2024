package function_example_03;

import java.util.function.Function;

public class FunctionExample03 {
    public static void main(String[] args) {
        //Function<Employee,String>employeeName=employee1 -> employee1.getName();
        Function<Employee,String>employeeName=Employee::getName;
        Employee employee1Name=new Employee("Ali",21);
        System.out.println(employeeName.apply(employee1Name));


        //Function<Employee,Integer>employee1Age=e->e.getAge();
        Function<Employee,Integer>employeeAge=Employee::getAge;
        Employee employee1Age=new Employee("Ali",21);
        System.out.println(employeeAge.apply(employee1Age));





    }
}
