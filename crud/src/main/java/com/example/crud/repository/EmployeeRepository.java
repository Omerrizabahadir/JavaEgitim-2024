package com.example.crud.repository;

import com.example.crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //kendi metodumuzu oluşturduk yaşı 39'dan büyük olanları listelemek için..
    @Query("SELECT e FROM Employee e WHERE e.age>39")
    List <Employee>findEmployeeListByOlderThan39();

    //kendi metodumuzu oluşturduk username sonu "E" ile bitenleri getir
    @Query("SELECT e FROM Employee e WHERE  e.username LIKE '%E'")
    List <Employee> findAllEmployeeByUserNameLetterEndsWithE();
}


