package aggregation01_final_kullanarak;

public class Address {

    //final kullanmak zorunda değiliz
    //final yapınca kızarır. Constructor koymalısın
    /*final neden kullandı: new ile ürettiğimde bu değişkenleri direkt yazmak istiyorum
    getter/setter ile uğraşmayım diye
     */

    private final String street;
    private final String city;


    public Address(String street, String city) {
        this.street = street;
        this.city = city;


    }
    public  void  add(String city){

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
