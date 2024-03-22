package factory_design_pattern_bootcamp_example_uxdesign_cc_the_factory_design_pattern;

public class WizardFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Wizard();
    }
}
