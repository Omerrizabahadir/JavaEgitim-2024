package com.example.many_to_one_example;

import com.example.many_to_one_example.model.Assignment;
import com.example.many_to_one_example.model.Student;
import com.example.many_to_one_example.repository.AssignmentRepository;
import com.example.many_to_one_example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ManyToOneExampleApplication implements CommandLineRunner {

    @Autowired
    private AssignmentRepository assignmentRepository;

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(ManyToOneExampleApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {

        Assignment assignment=new Assignment();
        assignment.setTitle("Java");
        assignment.setDueDate(new Date());


        assignmentRepository.save(assignment);

        //findAllAssignment();

       Student student=new Student();
       student.setStudentName("ali");
       student.setStudentType("mezun");
       student.setAge(17);

       studentRepository.save(student);

       //findAllStudent();


        studentRepository.deleteStudentById(102L);





    }
    public  void  findAllStudent(){
        List<Student>studentList=studentRepository.findAll();
        studentList.forEach(System.out::println);
    }
    public void findAllAssignment(){
        List<Assignment>assignmentList=assignmentRepository.findAll();
        assignmentList.forEach(System.out::println);
    }
    public void deleteStudentById(){
         studentRepository.deleteStudentById(102L);
    }
}
