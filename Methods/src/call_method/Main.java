package call_method;

public class Main {
    public int addNumbers(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        int num1=25;
        int num2=15;


        Main main=new Main();
       int result=main.addNumbers(num1,num2);
        System.out.println("Sum is :"+result);



    }
}
