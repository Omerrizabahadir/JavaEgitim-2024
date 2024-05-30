package com.example.springdatahomework.repository;

import com.example.springdatahomework.model.CustomerOrderDTO;
import com.example.springdatahomework.model.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    /*@Query("SELECT c.customer_name,o.order_id " +
            " FROM customer c " +
            " INNER JOIN orders o ON c.customer_id=o.customer_id " +
            " INNER JOIN product p ON p.product_id=o.product_id")*/

  /*@Query("select new com.example.springdatahomework.model.CustomerOrderDTO" +
          " (c.customerName,o.orderName)" +
          " from Customer c inner join Order o on o.customerId=c.customerId")
    List<CustomerOrderDTO>findOrderListById();*/

    /*@Query("SELECT o.orderName, COUNT(o.orderId) FROM Order o GROUP BY o.orderName")
    List<Order>findCustomersOrders();*/

    @Query("SELECT o.orderName, COUNT(o.orderId) FROM Order o GROUP BY o.orderName HAVING COUNT(o.orderId)=302")
    List<Order>findOrderListById();

}

