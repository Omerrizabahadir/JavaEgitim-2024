package com.example.springdataexample.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Orders")
@Getter
@Setter
@ToString
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ordertId;

    @Column (name = "product_id")
    private Long productId;

    @Column(name = "employee_name")
    private String employeeName;

}
