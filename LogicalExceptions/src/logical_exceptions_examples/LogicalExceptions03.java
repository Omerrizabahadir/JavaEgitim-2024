package logical_exceptions_examples;

public class LogicalExceptions03 {
    public static void main(String[] args) {
        // Declare the variable.
        int count;
// Create the loop.
        for (count=1; count<=10; count++) ; //for() dan sonra ; olmamalı mantık hatası
        {
            // Output the result.
            System.out.println("Count is " + count);
        }
    }
}
