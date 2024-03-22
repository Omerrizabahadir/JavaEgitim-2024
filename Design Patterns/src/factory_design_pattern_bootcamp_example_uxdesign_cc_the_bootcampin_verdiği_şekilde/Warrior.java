package factory_design_pattern_bootcamp_example_uxdesign_cc_the_bootcampin_verdiği_şekilde;

public class Warrior implements Character {
    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword!");
    }

    @Override
    public void defend() {
        System.out.println("Warrior defends with a shield!");
    }
}
