package generic_example01;

public class GenericClassExample01 {
    public static void main(String[] args) {


        GenericClass<Integer> intObj = new GenericClass<>(5);
        intObj.getData();


        GenericClass<String> stringObj = new GenericClass<>("hello");
        System.out.println(stringObj.getData());


    }
}
