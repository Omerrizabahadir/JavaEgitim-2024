package com.example.springdatahomework.repository;

import com.example.springdatahomework.model.Order;
import com.example.springdatahomework.model.Product;
import com.example.springdatahomework.model.ProductOrderDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


   /* //LEFT JOIN with JPQL
    @Query("SELECT new com.example.springdatahomework.model.ProductOrderDTO (p,o) FROM Product p LEFT JOIN Order o ")
    List<ProductOrderDTO> findProductsOrders();*/



    //(INNER) JOIN with JPQL
    @Query("SELECT new com.example.springdatahomework.model.ProductOrderDTO (p.color,p.price,o.orderDate) FROM Product p INNER JOIN Order o ON p.productName LIKE '%ö'")
    List<ProductOrderDTO> findByNameEndsWith();



}
