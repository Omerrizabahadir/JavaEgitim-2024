package begin_with_java_questions;

public class Solution18_i {

    /*i))
    **********
    **********
    **********
    **********
            */

    public static void main(String[] args) {

        Solution18_i solution18_i=new Solution18_i();
        solution18_i.ayniYaz();
    }
    public void ayniYaz(){

        for (int i=1;i<=4;i++){
            for (int j=10;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
