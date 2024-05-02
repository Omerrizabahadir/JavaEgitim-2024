package com.example.one_to_one_example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "owner")
@Getter
@Setter
@ToString
public class Owner {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "owner_id")
    private Long ownerId;

    @Column(name = "owner_name")
    private String ownerName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "house_id")
    private House house;

}
