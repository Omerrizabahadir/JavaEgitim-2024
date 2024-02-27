package final_keyword_exmple_create_final_method;

public class FinalDemo {
    //create a final metod

    public final void display(){
        System.out.println("This is a final method.");
    }
    class Main extends FinalDemo{
        //try to override final method
       // public  final  void display(){  //final method override edilemez

        }


    }

