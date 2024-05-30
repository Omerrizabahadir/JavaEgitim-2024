package com.example.springdataexample.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@ToString
@Getter
@Setter
public class ProductOrderDTO {

    private String productName;
    private double unitPrice;
    private String employeeName;

}
