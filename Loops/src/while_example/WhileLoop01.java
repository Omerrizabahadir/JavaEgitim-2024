package while_example;

public class WhileLoop01 {
    public static void main(String[] args) {
        int start=0, finish=5;

        while (finish>=start){

            System.out.println("Start değişkeni :"+ start +"Finish değişkeni:"+finish);
            start++;
            finish--;
        }
    }
}