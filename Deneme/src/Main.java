public class Main {
    public static void main(String[] args) {

        String str= "journaldev";

        //string to char array
        char[] chars=str.toCharArray();
        System.out.println(chars.length);
        System.out.println(chars.clone());


        System.out.println("-------------------");


        //char at spesific index
        char c=str.charAt(6);
        System.out.println(c);

        System.out.println("-------------------");


        char[]chars1=new char[7];
        str.getChars(0,7,chars1,0);
        System.out.println(chars1);



    }
}