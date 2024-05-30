package com.example.springdata;

import com.example.springdata.model.Employee;
import com.example.springdata.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {

        SpringApplication.run(SpringdataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* Employee employee = new Employee();
        employee.setAddress("Portekiz Lizbon");
        employee.setSurname("Ronaldo");
        employee.setFirstname("christiano");
        employee.setAge(29);

        employeeRepository.save(employee);*/
        //findAllEmployee();
        //findEmployeeById();
        updateEmployeeById();

    }

    public void findAllEmployee() {  //bütün dataları çekeceğim için List döner
        List<Employee> employeeList = employeeRepository.findAll();
        /*for (Employee employee : employeeList){
            System.out.println(employee.toString());
        }*/

        employeeList.forEach(System.out::println);
    }
    public void findEmployeeById(){
        Optional<Employee>employee=employeeRepository.findById(252L);
        //employee.ifPresent(System.out::println);  //ifpresent ise ekrana yaz yoksa devam et hiçbir şey yapma

        //Yukardaki ifpresent yerine bunu kullanmalısın.Data varsa data yı yazar yoksa null koyar
        //Employee e =employee.orElse(new Employee());
        //veya
        Employee e =employee.orElse(null);

    }
    public void updateEmployeeById(){
        Employee employee = new Employee();
        employee.setEmployeeId(342L);
        employee.setAddress("İspanya madrid");
        employee.setSurname("Saul");
        employee.setFirstname("Gonzales");
        employee.setAge(28);

        employeeRepository.save(employee);
    }
}
