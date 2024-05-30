package com.example.many_to_one_example.repository;

import com.example.many_to_one_example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query("DELETE FROM Student s WHERE s.Id < :200")
    void deleteStudentById(Long Id);
}



