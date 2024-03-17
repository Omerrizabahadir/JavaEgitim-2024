package generic_example05;


public class GenericClass06 {
    public static void main(String[] args) {
        //GenericClass<String> obj1=new GenericClass<>();
        // <T extends Number> ile yalnızca sayısal değer girilmesini isteyip sınırladık. bu nedenle hata verir
        GenericClass<Integer> obj2 = new GenericClass<>();
        GenericClass<Double> obj3 = new GenericClass<>();
        GenericClass<Long> obj4 = new GenericClass<>();
        //GenericClass<Boolean> obj5=new GenericClass<Boolean>(); //hata verecek
        //buradaki hatalar Compile exception (Derleme hatasıdır).Hiç çalışmayan kodlarda olur

        obj3.display();
    }
}
