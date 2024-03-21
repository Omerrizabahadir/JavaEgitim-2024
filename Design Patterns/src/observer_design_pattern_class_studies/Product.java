package observer_design_pattern_class_studies;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

    private String productName;
    private boolean available;
    private List<Observer> listObservers = new ArrayList<>();

    //Ürünün var olup-olmadığı bilgisini dönecek
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        if (available) {
            notifyObservers();
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    //Üründen haber almak isteyen müşteri döner
    public List<Observer> getListObservers() {
        return listObservers;
    }

    public void setListObservers(List<Observer> listObservers) {
        this.listObservers = listObservers;
    }

    //Ürünün haberini almak isteyen müşteriyi ekler
    @Override
    public void registerObserver(Observer observer) {
        System.out.println("İstediğiniz ürün stokta! Kaçırma");
    }

    //üründen haber almak istemeyen müşteriyi siler
    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Artık ürün bilgisi size iletilmeyecektir");

    }

    //Ürün ile ilgili değişiklikleri isteyen müşterilere iletir
    @Override
    public void notifyObservers() {
        System.out.println("Haberdar olmak isteyen müşterilere ürün geldiğinde haber verilmektedir");

        for (Observer observer : listObservers) {
            observer.update(productName);
        }
    }
}
