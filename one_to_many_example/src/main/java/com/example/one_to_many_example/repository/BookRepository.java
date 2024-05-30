package com.example.one_to_many_example.repository;

import com.example.one_to_many_example.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
