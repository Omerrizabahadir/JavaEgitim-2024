package function_example.function_homewok_java2blog_Given_the_list_of_employee_group_them_by_employee_name;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static function_example.function_homewok_java2blog_Given_the_list_of_employee_group_them_by_employee_name.Employee.createEmployeeList;


public class GroupingEmployee {
    public static void main(String[] args) {
        /*
        Given the list of employee, group them by employee name?
         */


        List<Employee> getEmployeeList = createEmployeeList().stream().toList();//Listeyi aldık
        Map<String, List<Employee>> employeeOfGroup = getEmployeeList.stream().collect(Collectors.groupingBy(Employee::getName));//map ile yapılacakları yazdık
        employeeOfGroup.forEach((name, employeeListTemp) -> System.out.println("Name : " + name //foreach ile bastık
                + "==>" + employeeListTemp));

    }


}
