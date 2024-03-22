package factory_design_pattern_bootcamp_example02_hocanın_yaptığı_şekilde;


import java.lang.reflect.InvocationTargetException;

public class CharacterFactory {
    public static Character createCharacterInstanceClass(Class aClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        return (Character) aClass.getDeclaredConstructor().newInstance();
    }
    public Character createCharacter(){


        return new Character() {
            @Override
            public void attack() {

            }

            @Override
            public void defend() {

            }
        };
    }
}