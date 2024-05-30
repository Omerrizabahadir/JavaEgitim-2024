package com.example.one_to_many_example;

import com.example.one_to_many_example.model.Author;
import com.example.one_to_many_example.model.Book;
import com.example.one_to_many_example.repository.AuthorRepository;
import com.example.one_to_many_example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class OneToManyExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OneToManyExampleApplication.class, args);
    }

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

        Author author = new Author();
        author.setAuthorName("Çehov");
        Book book = new Book();


        Set<Book> bookSet = new HashSet<>();
        author.setBookSet(bookSet);

        book.setBookName("6. koğuş");
        book.setAuthor(author);
        book.setPublicationDate("1982");


        authorRepository.save(author);
        bookRepository.save(book);
        //deleteBookById();
        //deleteAuthorById();
        //deleteAllBook();
    }

    public void deleteAuthorById() {
        authorRepository.deleteById(752L);
    }

    public void deleteAllBook() {
        bookRepository.deleteAll();
    }

    public void deleteAllAuthor() {
        authorRepository.deleteAll();
    }

    public void deleteBookById() {
        bookRepository.deleteById(752L);
    }

}