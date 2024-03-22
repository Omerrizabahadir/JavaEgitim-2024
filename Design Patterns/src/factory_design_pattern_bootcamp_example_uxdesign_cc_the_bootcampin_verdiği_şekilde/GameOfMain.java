package factory_design_pattern_bootcamp_example_uxdesign_cc_the_bootcampin_verdiği_şekilde;

public class GameOfMain {

    public static void main(String[] args) {
       CharacterFactory characterFactory= new WarriorFactory();
       Character character=characterFactory.createCharacter();
       character.attack();
       character.defend();

        System.out.println("---------------------");

        CharacterFactory characterFactory1=new WizardFactory();
        Character character1=characterFactory1.createCharacter();
        character1.attack();
        character1.defend();

        System.out.println("----------------------");

        CharacterFactory characterFactory2=new ArcherFactory();
        Character character2=characterFactory2.createCharacter();
        character2.attack();
        character2.defend();



        /*Yeni bir karakter olarak Ninja eklemek istedik
        Ninja class'ı oluşturup Character'e implement et
        NinjaFactory class'ı oluşturup onu da CharacterFactory'e extent et
        sonra main class ta çağır
         */

    }
}
