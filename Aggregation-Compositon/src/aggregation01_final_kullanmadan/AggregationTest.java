package aggregation01_final_kullanmadan;

public class AggregationTest {

    public static void main(String[] args) {


        //FİNAL OLMADIĞI İÇİN CONSTRUCTOR ZORUNLU DEĞİL.AMA YAZABİLİRSİN
        //constructor yazıpta çekebilirsin ya da aşağıda aggregate.setCity yapmalısın
        Address address = new Address();
        AggregateEmployee aggregateEmployee = new AggregateEmployee();

        address.setStreet("street2");
        address.setCity("İSTANBUL");


        aggregateEmployee.setId(2);
        aggregateEmployee.setAddress(address);
        aggregateEmployee.setName("Bilgeadam");

        /*bu aggregation modelinde address 'te aggregationEmployee'de
        tek başına ayakta kalabiliyor.
        yani addres'i null yaptığında aggregateEmployee sorun çıkarmaz onun bilgileri çıkar
        terside olur
         */
        address = null; //sadece address null olur
        //veya aggregateEmployee=null;  //sadece aggregateEmployee null olur.

       //işte bu LOOSE COUPLİNG
        System.out.println(address);
        System.out.println(aggregateEmployee);


    }
}