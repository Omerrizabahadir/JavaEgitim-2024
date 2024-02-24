package algorithyms_homeworks03_birds;

public class BirdSightedWithMethod {
    public static void main(String[] args) {


        int[] birdTypes = new int[6];
        int[] givenBirdTypeCount = {5, 1, 1, 5, 3, 3, 5, 3, 1};

        int minorBirdType = findMinorBirdType(birdTypes, givenBirdTypeCount);
        System.out.println("en çok tekrar eden tür :" + minorBirdType);
    }

    public static int findMinorBirdType(int[] birdTypes, int[] givenBirdTypeCount) {
        int max = 0;
        for (int birdType : givenBirdTypeCount) {
            birdTypes[birdType]++;
            max = Math.max(max, birdTypes[birdType]);
        }
        for (int i = 0; i < birdTypes.length; i++) {
            if (birdTypes[i] == max) {
                return i;

            }
        }
        return -1;
    }
}
