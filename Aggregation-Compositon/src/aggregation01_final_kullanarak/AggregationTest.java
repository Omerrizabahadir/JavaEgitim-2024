package aggregation01_final_kullanarak;

import aggregation01_final_kullanarak.Address;
import aggregation01_final_kullanarak.AggregateEmployee;

public class AggregationTest {
    public static void main(String[] args) {

        Address address1 = new Address("street1 ", "ANKARA");
        AggregateEmployee aggregateEmployee1 = new AggregateEmployee(1, "bilgeadam", address1);
        AggregateEmployee aggregateEmployee2 = new AggregateEmployee(1, "hasan", address1);
        AggregateEmployee aggregateEmployee3 = new AggregateEmployee(1, "burak", address1);

        address1.add("bursa");
        address1.add("bolu");


        System.out.println(address1);
        System.out.println(aggregateEmployee1);

        address1 = null;

        System.out.println(address1);
        System.out.println(aggregateEmployee1);


    }
}