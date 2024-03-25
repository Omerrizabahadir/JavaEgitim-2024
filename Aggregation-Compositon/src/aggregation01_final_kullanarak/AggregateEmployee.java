package aggregation01_final_kullanarak;

public class AggregateEmployee {
    private final int id;
    private final String name;
    private final Address adress;  //yaptığım Adrdress sınıfından street ve city değişkenlerini alacaz


    public AggregateEmployee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.adress = address;
    }

    //ekrana dataları yazdırmak için toString 'i generate et

    @Override
    public String toString() {
        return "AggregateEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }
}
