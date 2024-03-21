package observer_design_pattern_geekforgeeks_example;

public class WeatherAppMain {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TvDisplay();


        weatherStation.addObserver(phoneDisplay);


        //hava durumu değiştiğinde
        weatherStation.setWeather("Sunny");
        weatherStation.removeObserver(phoneDisplay);


        weatherStation.addObserver(tvDisplay);
        weatherStation.setWeather("Cloudy");

        phoneDisplay.update("Cold");
    }
}
