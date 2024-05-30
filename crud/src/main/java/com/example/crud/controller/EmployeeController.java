package com.example.crud.controller;

import com.example.crud.model.Employee;
import com.example.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //CRUD OPERATIONS
    //CREATE--> Creates a new resource. yeni employee oluşturma
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    //GET  --> Reads a resource.
    @GetMapping  //@GetMapping("/get")  path vermek zorunda değilsin get old. için.Ama path istersen bu da olur
    public List<Employee> getAllEmployeeList() {

        return employeeService.getAllEmployeeList();
    }

    //id'ye göre datayı getirsin.Id'nin findById(); metodu var tanımlı.Eğer id dışında age ,salary, username 'den birine göre getirmesini istiyorsan kendi metodunu yazmalısın
    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable("id") Long id) {
        return employeeService.findEmployeeById(id);
    }

    //kendi metodumuzu oluşturduk yaşı 39'dan büyük olanları listelemek için.
    @GetMapping("/older")
    public List<Employee> findEmployeeListOlderThan39() {
        return employeeService.findEmployeeListOlderThan39();

    }
    //username e ile bitenleri getir
    @GetMapping("/username")
    public List<Employee> findAllEmployeeByUserName(){
        return employeeService.findAllEmployeeByUserName();
    }
    //PUT -->Updates an existing resource. DİKKAT sadece id değiştirilemez risklidir. veritabanını bozar
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
    //DELETE
    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable("id")Long id){
       employeeService.deleteEmployeeById(id);
    }


}