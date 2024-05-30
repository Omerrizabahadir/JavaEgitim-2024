package com.example.springdatahomework.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;


@Entity
@Table(name = "orders")
@Getter
@Setter
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "product_id")
    private Long productId;
    private String orderName;
    private int quantity;
    @Temporal(TemporalType.DATE)
    private LocalDate orderDate;

}
