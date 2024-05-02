package com.example.one_to_one_example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "house")
@Getter
@Setter
@ToString
public class House {

    @Id
    @Column(name = "house_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long house_id;

    @Column(name = "no_of_floor")
    private int noOfFloor = 0;

    @Column(name = "no_of_bedroom")
    private int noOfBedroom = 0;

    @Column(name = "area")
    private String area = "";

    @OneToOne(mappedBy = "house", cascade = CascadeType.ALL)
    private Owner owner;

}
