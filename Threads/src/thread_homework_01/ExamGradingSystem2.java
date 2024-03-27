package thread_homework_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExamGradingSystem2 {
    public static void main(String[] args) {
        int numberOfStudents = 30;
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int studentId = 1; studentId <= numberOfStudents; studentId++) {
            Runnable studentTask = new StudentTask2(studentId);
            executor.execute(studentTask);
        }

        executor.shutdown();
    }
}

class StudentTask2 implements Runnable {
    private final int studentId;

    public StudentTask2(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void run() {
        // Bu bölümde öğrencinin notlarını hesaplayabilirsiniz
        // ve not ortalamasını bulabilirsiniz.
        System.out.println("Student " + studentId + ": Grading and calculating average...");

        // Öğrenci notları burada hesaplanır ve ortalama bulunur.
        double[] grades = generateRandomGrades();
        double averageGrade = calculateAverage(grades);

        System.out.println("Student " + studentId + ": Grades: " + gradesToString(grades));
        System.out.println("Student " + studentId + ": Average Grade: " + averageGrade);
    }

    private double[] generateRandomGrades() {
        double[] grades = new double[5];
        for (int i = 0; i < 5; i++) {
            grades[i] = Math.random() * 100; // Rastgele notlar üret
        }
        return grades;
    }

    private double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    private String gradesToString(double[] grades) {
        StringBuilder sb = new StringBuilder();
        for (double grade : grades) {
            sb.append(grade).append(" ");
        }
        return sb.toString();
    }
}
