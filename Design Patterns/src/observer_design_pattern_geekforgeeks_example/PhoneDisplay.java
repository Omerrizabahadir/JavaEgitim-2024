package observer_design_pattern_geekforgeeks_example;

public class PhoneDisplay implements Observer{
    private String weather;


    @Override
    public void update(String weather) {
        this.weather=weather;
        display();

    }
    private void display(){
        System.out.println("Cep telefonu görüntüsü : Hava durumu güncellendi - "+weather);
    }
}
