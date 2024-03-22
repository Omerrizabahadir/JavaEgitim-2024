package factory_design_pattern_bootcamp_example_uxdesign_cc_the_bootcampin_verdiği_şekilde;

public class Archer implements Character {
    @Override
    public void attack() {
        System.out.println("Archer attacks with a bow!");

    }

    @Override
    public void defend() {
        System.out.println("Archer defends with a dodge!");
    }
}
