package com.example.onetomany_example3.model;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "product")
@ToString
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    private Double price;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category; //bu category'i Category sınıfında  @OneToMany(mappedBy = "category") den geldi
}
