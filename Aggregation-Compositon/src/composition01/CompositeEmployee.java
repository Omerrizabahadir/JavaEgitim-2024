package composition01;



public class CompositeEmployee {
    private final int id;
    private final String name;
    private final Address address;

    public CompositeEmployee(int id, String name, String  street,String city) {
        this.id = id;
        this.name = name;
        this.address = new Address(street,city);
    }
    public  String caddeGetir(String cadde){

        return cadde;
    }

    @Override
    public String toString() {
        return "CompositeEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    private static class Address {
        private final String street;
        private final String city;

        private Address(String street, String city) {
            this.street = street;
            this.city = city;
        }
        public  String caddeGetir(String cadde){

            return cadde;
        }


        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
}
