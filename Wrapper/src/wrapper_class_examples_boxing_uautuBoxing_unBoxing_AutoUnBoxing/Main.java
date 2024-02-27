package wrapper_class_examples_boxing_uautuBoxing_unBoxing_AutoUnBoxing;

@SuppressWarnings("removal")
public class Main {
    public static void main(String[] args) {

        //AUTOBOXİNG--->primitive to Wrapper automaticly
        Integer autoBoxing=100;

        //BOXİNG--->primitive to Wrapper with method
        Integer boxing=new Integer(100);
        Integer boxing2=Integer.valueOf(100);


        //AUTOUNBOXİNG-->Wrapper to primitive
        Integer number=100;    //autoboxing
        int autoUnBoxing1=number;   //autoUnBoxing



        //UNBOXİNG--->Wrapper to primitive with method

        Integer nmbr=100;
        int autoUnBoxing2=nmbr.intValue();//unBoxing


    }
}
