package generic_example02;

public class GenericClassExample02 {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.addItem(14);
        System.out.println("message : " + intBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.addItem("hello");
        System.out.println(stringBox.getItem());
         /*  List<String> stringList = new ArrayList<>();
        stringList.add()
        Collections'lardaki add();metodunda yaptığımız gibi. ona benziyor
        */
    }
}
