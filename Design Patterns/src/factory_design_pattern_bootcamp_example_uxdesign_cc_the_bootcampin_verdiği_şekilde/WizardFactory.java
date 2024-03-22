package factory_design_pattern_bootcamp_example_uxdesign_cc_the_bootcampin_verdiği_şekilde;

public class WizardFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Wizard();
    }
}
