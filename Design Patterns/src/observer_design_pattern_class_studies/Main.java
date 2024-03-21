package observer_design_pattern_class_studies;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setCustomerName("Hasan ");
        System.out.println("Customer 1 adı : " + customer1.getCustomerName());

        Customer customer2 = new Customer();
        customer2.setCustomerName("Kadir ");
        System.out.println("Customer 2 adı : " + customer2.getCustomerName());


        Product product1 = new Product();
        product1.setProductName("Apple Iphone 7 ");
        product1.setAvailable(false);


        //iphone 7 geldiğinde bildirim almak istiyorlar.
        product1.registerObserver(customer1);
        product1.registerObserver(customer2);

        //ürün geldi
        product1.setAvailable(true);

        //ürün bitti
        product1.setAvailable(false);

        //customer1 haber almak istemiyor
        product1.removeObserver(customer1);

        //ürün geldi
        product1.setAvailable(true);
        customer1.update(product1.getProductName());


    }
}
