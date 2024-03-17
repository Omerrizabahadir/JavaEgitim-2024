package generic_example07;

public class GenericsVarArgsExample {


    //Bu ...  --> üç nokta sayesinde istediğimiz kadar parametre kullanabiliriz
    public  static <T> void printArray(T ... items){

        for (T item : items){
            System.out.println(item+" ");
        }
        System.out.println();

    }

    public static void withdraw(String cardio, Double price){

    }

    public static void main(String[] args) {
        System.out.println("String Dizisi : ");
        //istediğimiz kadar parametre belirtebiliriz
        printArray("merhaba","dünya","java");
        printArray("mehaba","dünya");
        printArray("merhaba");

        System.out.println("Integer Dizisi : ");
        printArray(1,2,3,4,5,7);
        printArray(1,3,4,7);
        printArray(1,3,7);


        System.out.println("Double Dizisi : ");
        printArray(1.2,4.4,9.7,0.3);
    }
}
