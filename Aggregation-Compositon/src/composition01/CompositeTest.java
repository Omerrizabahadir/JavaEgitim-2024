package composition01;

import aggregation01_final_kullanmadan.Address;

public class CompositeTest {
    public static void main(String[] args) {

        CompositeEmployee compositeEmployee=new CompositeEmployee(1,"bilgeadam","street1","Ankara");
        System.out.println(compositeEmployee);
        System.out.println(compositeEmployee.caddeGetir("cad1"));

        compositeEmployee=null;
        System.out.println(compositeEmployee);
        compositeEmployee.caddeGetir("cad3");





        /*dışardan address'e erişemiyorsun.Sadece CompositeEmployee
        içerisinden erişir.CompositeEmployee null olunca adress te otomatik null oluyor
         */
    }
}
