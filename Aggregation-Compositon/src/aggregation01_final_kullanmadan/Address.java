package aggregation01_final_kullanmadan;

public class Address {
    private String street;
    private String city;


//getter ve setterları koyarız

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    //ekrana dataları yazdırmak için toString 'i generate et

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
