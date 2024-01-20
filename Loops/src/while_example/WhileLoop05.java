package while_example;

public class WhileLoop05 {
    public static void main(String[] args) {
        int start=0;
        int finish=5;
        boolean devamEt=true;

        while (devamEt){
            System.out.println("Start:"+start+" \tFinish:"+finish);
            start++;
            finish--;
            if (start>5 && finish<=0) {
                devamEt = false;
            }

            System.out.println("program kapatılıyor");
        }

    }
}
