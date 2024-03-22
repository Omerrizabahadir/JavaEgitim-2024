package factory_design_pattern_bootcamp_example_uxdesign_cc_the_bootcampin_verdiği_şekilde;

public class Wizard implements Character{
    @Override
    public void attack() {
        System.out.println("Wizard attacks with a magic");
    }

    @Override
    public void defend() {
        System.out.println("Wizard defends with a");
    }
}
