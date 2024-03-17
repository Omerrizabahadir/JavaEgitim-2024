package generic_example03;

public class GenericMethod01 {

    //Class generic olmadan metot'u generic yapabiliriz
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 5, 73, 82};
        Double[] doubleArray = {1.1, 3.4, 5.5, 73.9, 82.2};
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};

        System.out.println("Integer Array : ");
        printArray(intArray);

        System.out.println("Double Array : ");
        printArray(doubleArray);

        System.out.println("String Array : ");
        printArray(stringArray);
    }

}
