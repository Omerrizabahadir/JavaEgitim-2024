package aggregation02_scaler_com_example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("India");
        Country country2 = new Country("Italy");


        SportPerson maculum = new SportPerson("Mccullum");
        SportPerson dhoni = new SportPerson("Dhoni");
//Country nesnesi oluşturmadık daha sportPerson oluşabiliyor

        System.out.println(country1);
        System.out.println(country2);

        List<SportPerson> listOfSportPersons = new ArrayList<>();
        listOfSportPersons.add(maculum);
        listOfSportPersons.add(dhoni);


        country1 = null;
        System.out.println(country1);
        System.out.println(maculum);
    }
}
