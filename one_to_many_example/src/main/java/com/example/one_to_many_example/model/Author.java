package com.example.one_to_many_example.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Entity
@Table(name = "Author")
@Getter
@Setter
@ToString
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "author_name")
    private String authorName;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private Set<Book> bookSet;

    public Set<Book> getBook() {

        if (this.bookSet.equals(null)) {
            this.bookSet = new HashSet<>();

        }
        return this.bookSet;
    }

}

