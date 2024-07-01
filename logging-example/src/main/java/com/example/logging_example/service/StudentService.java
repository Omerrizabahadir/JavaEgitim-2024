package com.example.logging_example.service;

import com.example.logging_example.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Service
public class StudentService {


    private static final Logger logger = Logger.getLogger(StudentService.class.getName());


    public List<Student> getStudentList() {
        logger.info("getOgrenci() çalıştı.");
        return Arrays.asList(new Student(1, "burak"), new Student(2, "Ali"));
    }
}