package com.example.onetomany_example3;

import com.example.onetomany_example3.model.Category;
import com.example.onetomany_example3.model.Product;
import com.example.onetomany_example3.repository.CategoriesRepository;
import com.example.onetomany_example3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class OneToManyExample3Application implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoriesRepository categoriesRepository;


    public static void main(String[] args) {
        SpringApplication.run(OneToManyExample3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        insertData();
       // deleteData(1L);
        //findCategoryAndProductList();
    }

    private void insertData() {
        Category category=new Category();

        category.setName("organik");


        Product product=new Product();
        product.setPrice(25.50);
        product.setName("yumurta");
        product.setCategory(category);


       // productRepository.save(product);
       findCategoryAndProductList();

    }
    public void deleteData(Long id){
        productRepository.deleteById(id);
    }
    private  void findCategoryAndProductList(){
        Optional<Category>category =categoriesRepository.findById(2L);

        if (category.isPresent()){
            category.ifPresent(System.out::println);
        }

    }
public void findAllCategoryAndProductById(){
        productRepository.findById(2L);
}

}
