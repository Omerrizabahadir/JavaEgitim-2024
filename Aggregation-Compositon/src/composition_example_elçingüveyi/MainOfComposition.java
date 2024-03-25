package composition_example_elçingüveyi;

public class MainOfComposition {
    public static void main(String[] args) {
        House home = new House();
        System.out.println(home);
        System.out.println(home.getm2("Kitchen"));


        home=null;
        //home nesnesi null olunca artık room nesneside kullanılamaz
        //nullPointer hatası verecek
        System.out.println(home);
        System.out.println(home.getm2("Kitchen"));
    }
}
