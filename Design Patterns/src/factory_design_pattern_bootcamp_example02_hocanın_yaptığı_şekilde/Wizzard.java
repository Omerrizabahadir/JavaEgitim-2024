package factory_design_pattern_bootcamp_example02_hocanın_yaptığı_şekilde;

public class Wizzard implements Character {
    @Override
    public void attack() {
        System.out.println("Wizard attacks with magic!");
    }

    @Override
    public void defend() {
        System.out.println("Wizard defends with a spell!");
    }
}
