package com.example.crud.service;

import com.example.crud.model.Employee;
import com.example.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee createEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployeeList() {

        return employeeRepository.findAll();
    }

    public Employee findEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return employee.get();

        } else {
            throw new RuntimeException("No employee for requested id " + id);
        }
    }

    //kendi metodumuzu oluşturduk yaşı 39'dan büyük olanları listelemek için..
    public List<Employee> findEmployeeListOlderThan39() {
        return employeeRepository.findEmployeeListByOlderThan39();

    }

    //USERNAME e İLE BİTENLERİ GETİR
    public List<Employee> findAllEmployeeByUserName() {
        return employeeRepository.findAllEmployeeByUserNameLetterEndsWithE();
    }

    //UPDATE
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public void deleteEmployeeById(Long id){
        employeeRepository.deleteById(id);
    }
}