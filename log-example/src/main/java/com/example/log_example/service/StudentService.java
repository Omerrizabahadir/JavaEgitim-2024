package com.example.log_example.service;

import com.example.log_example.model.Student;
import com.example.log_example.repository.StudentRepository;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Service
public class StudentService {

    private static final Logger loger =  Logger.getLogger(StudentService.class.getName());
    private StudentRepository studentRepository;

    public List<Student> getStudentList(){
        loger.info("getStudentList metodu çalıştı.");
        return Arrays.asList(new Student(1L,"Ömer"),new Student(2L,"Gökçe"));
    }

}
