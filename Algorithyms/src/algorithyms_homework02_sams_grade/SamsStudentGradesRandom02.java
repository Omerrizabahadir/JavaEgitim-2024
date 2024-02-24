package algorithyms_homework02_sams_grade;

import java.util.Random;
import java.util.Scanner;

public class SamsStudentGradesRandom02 {
    public static void main(String[] args) {

        SamsStudentGradesRandom02 samsStudentGradesRandom02 = new SamsStudentGradesRandom02();
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaç öğrenci puanı olsun?");
        int n =scanner.nextInt();
        int []grades= samsStudentGradesRandom02.generateRandomStudentsPoints(n);
        int[] newPoints = samsStudentGradesRandom02.gradingStudents(grades);
        for (int grade:newPoints)
        System.out.println(grade);
    }

    public int[] gradingStudents(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (!(grade < 38)) {
                int newMultiple = (int) (Math.ceil((double) grade / 5) * 5);
                if (newMultiple - grade < 3) {
                    grades[i]= newMultiple;
                }
            }
        }

        return grades;
    }

    public int[] generateRandomStudentsPoints(int n) {

        Random random = new Random();
        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            grades[i] = random.nextInt(101);
        }
        return grades;
    }
}
