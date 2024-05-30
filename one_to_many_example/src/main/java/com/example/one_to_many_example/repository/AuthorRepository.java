package com.example.one_to_many_example.repository;

import com.example.one_to_many_example.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
