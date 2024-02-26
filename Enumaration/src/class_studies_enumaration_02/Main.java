package class_studies_enumaration_02;

public class Main {
    public static void main(String[] args) {

        System.out.println(Size.SMALL.compareTo(Size.MEDIUM));
        System.out.println(Size.SMALL.toString());
        System.out.println(Size.LARGE.name());
        System.out.println(Size.valueOf("EXTRALARGE"));

        System.out.println("--------foreach ile------");

        for (Size c: Size.values()){
           System.out.println(c);
       }

    }
}
