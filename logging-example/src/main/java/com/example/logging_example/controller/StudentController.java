package com.example.logging_example.controller;

import com.example.logging_example.model.Student;
import com.example.logging_example.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping("/students")
@CrossOrigin
public class StudentController {

    private static final Logger logger = Logger.getLogger(StudentController.class.getName());

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudentList() {
        logger.info("inside StudentController.getStudent() çalıştı.");
        return studentService.getStudentList();
    }
}
