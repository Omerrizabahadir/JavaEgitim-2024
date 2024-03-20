package without_using_state_design_pattern_for_lamp_open_or_close;
public class Main {
    boolean lampIsOpen=false;


    public static void main(String[] args) {

    Main main=new Main();
    main.lampControl();
        System.out.println("Lambanın durumu : "+main.lampIsOpen);
    }
    public void lampControl(){
        if (lampIsOpen){
            lampIsOpen=true;
            System.out.println("Lamba açıldı");
        } else if (lampIsOpen==true) {
            lampIsOpen=false;
            System.out.println("Lamba kapalı");
        }
    }
}
