package com.example.springdataexample.repository;

import com.example.springdataexample.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    //Order Tablosunu hepsini siler
    @Modifying
    @Query("DELETE FROM Order")
    void deleteAllOrder();



}


