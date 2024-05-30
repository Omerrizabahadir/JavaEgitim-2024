package com.example.springdataexample;

import com.example.springdataexample.model.Order;
import com.example.springdataexample.model.Product;
import com.example.springdataexample.repository.OrderRepository;
import com.example.springdataexample.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringdataexampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataexampleApplication.class, args);
    }

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {


       Product product = new Product();
        product.setProductName("Aniseed Syrup");
        product.setUnitPrice(10.00D);
        productRepository.save(product);
        System.out.println("ürün eklenmiştir");

        findAllProduct();
        // deleteByProductPrice();

        Order order = new Order();
        order.setProductId(product.getProductId());
        order.setEmployeeName("Ana Trujillo");
        orderRepository.save(order);
         findAllOrder();

        //deleteAllProduct();
        //dropAllOrder();
    }

    public void findAllProduct() {

        List<Product> productList = productRepository.findAll();
        productList.forEach(System.out::println);
    }

    public void deleteByProductPrice() {
        productRepository.deleteAll();

    }

    public void findAllOrder() {
        List<Order> orderList = orderRepository.findAll();
        orderList.forEach(System.out::println);
    }


    public void deleteAllProduct() {
        productRepository.deleteAll();

    }


    public void dropAllOrder() {

        orderRepository.deleteAll();
    }
    public void getProductTableAllAndOrderTableEmployeeName(){

    }
}
