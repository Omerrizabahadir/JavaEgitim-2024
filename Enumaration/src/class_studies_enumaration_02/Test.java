package class_studies_enumaration_02;

public class Test {

        Size pizzaSize;


    public Test(Size pizzaSize) {
            this.pizzaSize = pizzaSize;
        }

        public void orderPizza () {
            switch (pizzaSize) {
                case SMALL -> {
                    System.out.println("I ordered a small size pizza ");
                }
                case MEDIUM -> {
                    System.out.println("I ordered a medium size pizza ");

                }
                case LARGE -> {
                    System.out.println("I ordered a large size pizza ");

                }
                case EXTRALARGE -> {
                    System.out.println("I ordered a extralarge size pizza ");

                }
            }
        }

}