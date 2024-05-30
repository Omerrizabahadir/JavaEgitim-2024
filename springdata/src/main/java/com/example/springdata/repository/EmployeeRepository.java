package com.example.springdata.repository;

import com.example.springdata.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //Hibernate: select e1_0.employee_id,e1_0.address,e1_0.age,e1_0.firstname,e1_0.surname from employee e1_0
    // where e1_0.firstname=? and e1_0.surname=?
    List<Employee> findEmployeeByFirstAndSurname(String firstname, String surname);

    //select * from employee where firstname = 'c' OR address = b AND age = 20
    // List<Employee> findEmployeeByFirstnameOrAddressAndAge(String firstname, String address, int age);


    @Query("select e from Employee e where e.firstname=:f and e.surname=:s")
    List<Employee>findEmployeeListByFirstnameAndSurname(String f,String s);
    // List<Long> findEmployeeListByFirstnameAndSurname(String f, String s);
}
