package interface_new_features.interface_new_features_02;

public interface Animal {

    //abstract(gövdesiz) metot implements etmek zorundasın
    abstract void make();

    //gövdeli default veya static metotları ise istersen override edersin
    public default void eat(){
        System.out.println("Default method say : eat");
    }

    public default void run(){
        System.out.println("Default method say : run");
    }
    public  static void breath(){
        System.out.println("Static method say : take breath");
    }
}
