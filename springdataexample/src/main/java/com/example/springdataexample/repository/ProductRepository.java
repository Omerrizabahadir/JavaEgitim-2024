package com.example.springdataexample.repository;

import com.example.springdataexample.model.Product;
import com.example.springdataexample.model.ProductOrderDTO;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    @Query("DELETE FROM Product product_price")
    void deleteByProductPrice();


    //Product Tablosunu hepsini siler
    @Modifying
    @Query("DELETE FROM Product")
    void deleteAllProduct();

    @Query("SELECT new com.example.springdataexample.model.ProductOrderDTO (p,o) FROM Product p LEFT JOIN Order o")
   List<ProductOrderDTO> joinProductTableColumnWithOrderEmployeeName();
}
