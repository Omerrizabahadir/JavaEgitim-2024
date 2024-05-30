package com.example.springdatahomework.repository;

import com.example.springdatahomework.model.Customer;
import com.example.springdatahomework.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c")
    List<Customer>findAllCustomer();

}
