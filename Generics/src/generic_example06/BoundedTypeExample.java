package generic_example06;

public class BoundedTypeExample {


    public static <T extends Number> void findMinMax(T[] array) {
        //null pointer hatası vermesin diye if else yapısı kullanıyoruz
        //bu if ile null ve 0 da geç demeseydik RunTimeException hatası verirdi
        if (array == null || array.length == 0) {
            return;
        }
        T min = array[0];
        T max = array[0];

        for (T element : array) {
            if (element.doubleValue() < min.doubleValue()) {
                min = element;

            }
            if (element.doubleValue() > max.doubleValue()) {
                max = element;
            }

        }

        System.out.println("Min :" + min);
        System.out.println("Max :" + max);
    }

    public static void main(String[] args) {
        Integer[] intArray = {2, 7, 1, 9, 5};
        Double[] doubleArray = {3.4, 7.2, 1.8, 9.9, 5.1};

        System.out.println("Integer min max ");
        findMinMax(intArray);

        System.out.println("Double min max ");
        findMinMax(doubleArray);

        Integer[] emptyIntArray = {}; //hata vermez çünkü yukarda if ile null veya 0 ise return yap dedik
        findMinMax(emptyIntArray);


        String[] stringArray = {"mehaba", "hello", "hola"};
        //findMinMax();    generic yapıyı Number ile sınırladığımız için String hata verecektir


    }
}
