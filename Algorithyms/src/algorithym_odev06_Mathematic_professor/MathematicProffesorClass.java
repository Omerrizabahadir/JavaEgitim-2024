package algorithym_odev06_Mathematic_professor;

public class MathematicProffesorClass {
    int[] arrayOfStudentscomingOnTimeOrLate = {-2, -1, 0, 1, 2, 0, 2};
    String claasIsCancelled = " Hayır";
    String claasIsContinue = " Evet";
    int tresholdArrivingStudentsCounter = 0;
    int lateArrivingStudentsCounter = 0;


    public int getNumberOfStudentsArray() {
        for (int i = 0; i < arrayOfStudentscomingOnTimeOrLate.length; i++) {
            
            System.out.println(arrayOfStudentscomingOnTimeOrLate[i]);

            if (arrayOfStudentscomingOnTimeOrLate[i] <= 0) {
                tresholdArrivingStudentsCounter++;
            }
            if (arrayOfStudentscomingOnTimeOrLate[i] > 0) {
                lateArrivingStudentsCounter++;
            }
        }
        System.out.println("Zamanında gelen öğrenciler :" + tresholdArrivingStudentsCounter);
        System.out.println("Geç kalan öğrenciler :" + lateArrivingStudentsCounter);
        return 0;
    }

    public String willClassContinueOrCancell() {
        if (tresholdArrivingStudentsCounter > lateArrivingStudentsCounter) {
            System.out.println("Ders başlayacak mı ?" + claasIsContinue);
        } else {
            System.out.println("Ders iptal edilecek mi ?" + claasIsCancelled);

        }

        return null;
    }
}
