package algorithyms_homeworks;

public class SamsStudentsGrades01 {


    public static void main(String[] args) {
        int[] points = {23, 29, 37, 38, 54, 67, 78, 93};

        SamsStudentsGrades01 samsStudentsGrades01 = new SamsStudentsGrades01();
        int[] newPoints= samsStudentsGrades01.gradingStudents(points);
        for (int grade: newPoints){
            System.out.println(grade);
        }
    }

    public int[] gradingStudents(int[] grades) {

        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (!(grade < 38)) {
                int nextMultiple = (int) (Math.ceil((double)grade/5)*5);
               if (nextMultiple-grade<3){
                  grades[i]=nextMultiple;
               }
            }
        }

        return grades;
    }


}
