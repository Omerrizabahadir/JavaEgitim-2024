package factory_design_pattern_bootcamp_example02_hocanın_yaptığı_şekilde;

public class Archer implements Character{
    @Override
    public void attack() {
        System.out.println("Archer attacks with a bow!");
    }

    @Override
    public void defend() {
        System.out.println("Archer defends with a dodge!");
    }
}
