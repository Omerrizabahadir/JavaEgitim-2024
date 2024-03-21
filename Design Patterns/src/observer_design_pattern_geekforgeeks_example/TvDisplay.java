package observer_design_pattern_geekforgeeks_example;

public class TvDisplay implements Observer {

    private String weather;


    public String getWeather() {
        return weather;
    }

    public void setWeather(String newWeather) {

    }

    @Override
    public void update(String weather) {
    this.weather=weather;
    display();

    }

    private void display() {
        System.out.println("TV görümümü : Hava durumu güncellendi -"+weather);
    }
}
