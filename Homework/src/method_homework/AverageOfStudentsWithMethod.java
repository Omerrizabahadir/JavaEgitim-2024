package method_homework;

public class AverageOfStudentsWithMethod {
    /*Öğrencilerin almış olduğu notların ortalaması hesaplayan bir ortalama methodu yazın.
    Notları dizi içerisinde tutup methoda diziyi gönderin.
     */
    public static void main(String[] args) {
        int[] array = {45, 67, 89, 54, 30};
        AverageOfStudentsWithMethod averageOfStudentsWithMethod = new AverageOfStudentsWithMethod();
        averageOfStudentsWithMethod.averageOfAStudentsGrades(array);

    }

    public double averageOfAStudentsGrades(int[] array) {
        int average = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];
            average = sum / array.length;
        }
        System.out.println("Notların ortalaması : "+average);
        return average;
    }
}
