package factory_design_pattern_bootcamp_example02_hocanın_yaptığı_şekilde;

import java.lang.reflect.InvocationTargetException;

public class GameOfMain {
    public static void main(String[] args) {

        try {
            Warrior warrior = (Warrior) CharacterFactory.createCharacterInstanceClass(Warrior.class);
            warrior.attack();
            warrior.defend();

            System.out.println("--------------------");

            Wizzard wizzard = (Wizzard) CharacterFactory.createCharacterInstanceClass(Wizzard.class);
            wizzard.attack();
            wizzard.defend();

            System.out.println("--------------------");

            Archer archer = (Archer) CharacterFactory.createCharacterInstanceClass(Archer.class);
            archer.attack();
            archer.defend();


        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
