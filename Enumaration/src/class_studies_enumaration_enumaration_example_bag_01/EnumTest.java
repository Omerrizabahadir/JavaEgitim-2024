package class_studies_enumaration_enumaration_example_bag_01;

public class EnumTest {
    public static void main(String[] args) {

        BagSize bagSize = BagSize.MEDIUM;

        System.out.println("Bag is : "+bagSize.name());
        System.out.println("Bag price is : "+bagSize.getPrice()+"$");
        System.out.println("Bag color is : "+bagSize.getColor());
    }
}
