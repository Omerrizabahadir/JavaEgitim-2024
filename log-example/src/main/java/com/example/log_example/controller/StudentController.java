package com.example.log_example.controller;

import com.example.log_example.model.Student;
import com.example.log_example.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping
public class StudentController {

    private static final Logger logger = Logger.getLogger(StudentController.class.getName());
    private StudentService studentService;

    public List<Student> getStudentList() {
logger.info("StudentController.getStudentList() metodu çalıştı.");
        return studentService.getStudentList();
    }

}
