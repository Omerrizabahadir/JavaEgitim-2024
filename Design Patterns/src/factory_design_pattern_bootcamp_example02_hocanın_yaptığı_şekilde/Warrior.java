package factory_design_pattern_bootcamp_example02_hocanın_yaptığı_şekilde;

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
