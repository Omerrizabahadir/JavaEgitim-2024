package class_studies_enumaration_enumaration_example_bag_01;

public enum BagSize {
    SHORT(15,"black"), MEDIUM(20,"red"), BIG(25,"white");

    private int price;
    private  String color;

    BagSize(int price,String color) {
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
