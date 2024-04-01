package function_homewok_javabrahmancom;

import function_example_03.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    /*
    Aşağıdaki kod, apply()Çalışan türleri listesinden
    tüm Çalışanların adlarını içeren Dizeler listesine dönüştürdüğü/eşleştirdiği yöntemin
    örnek kullanımını gösterir.
     */

    public static List<String> convertEmployeeListToNamesList(List<Employee>employeeList, Function<Employee,String>functionEmployeeToString){
        List<String>employeeNameList=new ArrayList<>();
        for (Employee e : employeeList){
            employeeNameList.add(functionEmployeeToString.apply(e));
        }
        return employeeNameList;
    }

    public static void main(String[] args) {
        Function<Employee,String> functionEmployeeToString=Employee::getName;
        List<Employee>employeeList= Arrays.asList(new Employee("harry major",45),
                new Employee("ethan hardy",24),
                new Employee("nancy smith",65),
                new Employee("deborah sprightly",29));
        List<String>empNameList=convertEmployeeListToNamesList(employeeList,functionEmployeeToString);
        empNameList.forEach((System.out::println));
    }
}
