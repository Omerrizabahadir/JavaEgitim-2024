package logical_exceptions_examples;

public class LogicalExceptions02 {
    public static void main(String[] args) {
        int result1 = 5 + 4 * 3/2;
        int result2 = (5 + 4) * 3/2;
        int result3 = (5 + 4) * (3/2);
        int result4 = (5 + (4 * 3)) / 2;
        System.out.println(("result1:" + result1 + "\nresult12:" + result2 + "\nresult13:" + result3 +
                "\nresult14:" + result4));


        //hata fırlatmaz ama mantık olarak hatalı
    }
}
