package builder_design_pattern_geekforgeeks;

public class Main {
    public static void main(String[] args) {

       Computer computer=new Computer.ComputerBuilder()
               .setCpu("Gaming CPU")
               .setRam("16GB DDR4")
               .setStorage("1TB SSD")
               .build();


        System.out.print("\n"+computer.toString());

    }
}
