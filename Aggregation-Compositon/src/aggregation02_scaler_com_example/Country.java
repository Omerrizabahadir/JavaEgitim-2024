package aggregation02_scaler_com_example;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;

    List<SportPerson> sportPersons;

    public List<String> getSportPersons() {
        List<SportPerson> listOfSportPersons = this.sportPersons;
        List<String> names = new ArrayList<String>();
        for (SportPerson sportPerson : listOfSportPersons) {
            names.add(sportPerson.getName());
        }
        return names;
    }

    public void setSportPersons(List<SportPerson> sportPersons) {
        this.sportPersons = sportPersons;
    }

    public Country(String name) {

        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", sportPersons=" + sportPersons +
                '}';
    }
}

class SportPerson {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public SportPerson(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "SportPerson{" +
                "name='" + name + '\'' +
                '}';
    }
}