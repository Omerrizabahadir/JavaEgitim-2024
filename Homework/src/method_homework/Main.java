package method_homework;

public class Main {
     /*Öğrencilerin almış olduğu notların ortalaması hesaplayan bir ortalama methodu yazın.
    Notları dizi içerisinde tutup methoda diziyi gönderin.
   */

    public static void main(String[] args) {

        int[] studentsGrades = {34, 90, 67, 56};
        Main main = new Main();
        main.studentsGradesAverage(studentsGrades);
    }

    public double studentsGradesAverage(int[] studentsGrades) {
        int  average = 0;
        for (int i = 0; i <studentsGrades.length;i++) {
        average+=studentsGrades[i];

        }
        System.out.println("Not ortalama : "+(double)average/studentsGrades.length);

        return average;
    }
}
