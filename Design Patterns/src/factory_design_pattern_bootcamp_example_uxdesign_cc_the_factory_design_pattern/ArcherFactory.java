package factory_design_pattern_bootcamp_example_uxdesign_cc_the_factory_design_pattern;

public class ArcherFactory extends CharacterFactory {

    @Override
    public Character createCharacter() {
        return new Archer();
    }
}
