package com.example.springdatahomework.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

public class ProductOrderDTO {

    @Getter
    @Setter
    private Long product_id;
    private String productName;
    private String color;
    private double price;
    private Long orderId;
    private int quantity;
    private LocalDate orderDate;

}
