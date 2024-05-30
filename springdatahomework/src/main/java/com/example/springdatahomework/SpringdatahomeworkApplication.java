package com.example.springdatahomework;

import com.example.springdatahomework.model.Customer;
import com.example.springdatahomework.model.CustomerOrderDTO;
import com.example.springdatahomework.model.Order;
import com.example.springdatahomework.model.Product;
import com.example.springdatahomework.repository.CustomerRepository;
import com.example.springdatahomework.repository.OrderRepository;
import com.example.springdatahomework.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringdatahomeworkApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;


    public static void main(String[] args) {
        SpringApplication.run(SpringdatahomeworkApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        //FOR CUSTOMER

       /*Customer customer = new Customer();
        customer.setCustomerName("batu");
        customer.setCustomerSurname("küçük");
        customer.setAge(28);
        customer.setEmail("bat@gmail.com");
        customer.setAddress("ankara/balgat");

        customerRepository.save(customer);
        findAllCustomer();
        //findCustomerById();
        //updateCustomerById();


        //FOR PRODUCT

   /*Product product = new Product();
        product.setProductName("gözlük");
        product.setPrice(6750.00);
        product.setColor("siyah");

        productRepository.save(product);*/
        findAllProduct();
        //updateProductById();
        //findProductById();

        //FOR ORDER

        /*Order order=new Order();
        order.setOrderDate(LocalDate.of(2023,7,19));
        order.setQuantity(1);
        order.setOrderName("ord102");
        orderRepository.save(order);*/
        findAllOrder();
        //findOrderById();



       // customerOrderDTO();


    }
    public void findAllCustomer() {
        List<Customer> customerList = customerRepository.findAll();

        customerList.forEach(System.out::println);
    }

    public void findAllProduct(){
        List<Product> productList = productRepository.findAll();
    }
    public void findAllOrder(){
        List<Order>orderList=orderRepository.findAll();
    }

    public void countAndGroupByCustomerOrder(){
        List<Order> orderingAndCountingCustomersOrders=orderRepository.findAll();
    }

    public void findCustomerById() {
        Optional<Customer> customer = customerRepository.findById(2L);
        Customer c = customer.orElse(null);
        System.out.println(c);
    }

    public void updateCustomerById() {
        Customer customer = new Customer();
        customer.setCustomerId(2L);
        customer.setAddress("ankara/oran");
        customerRepository.save(customer);
    }

    public void updateProductById(){
        Product product=new Product();
        product.setProduct_id(52L);
        product.setPrice(1790.00);

        productRepository.save(product);

    }

    public void findProductById(){
        Optional<Product>product=productRepository.findById(2L);
        Product p=product.orElse(null);
    }
    public void findOrderById() {
        Optional<Order> order = orderRepository.findById(2L);
        Order o = order.orElse(null);
        System.out.println(o);
    }
    /*public void customerOrderDTO(){
        List<CustomerOrderDTO> orderDTOList = orderRepository.findOrderListById();
        orderDTOList.forEach(System.out::println);
    }*/


}
