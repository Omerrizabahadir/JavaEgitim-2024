package algorithyms_homeworks03_birds;

public class BirdSighted01 {
    public static void main(String[] args) {
        int [] birdTypes=new int[6];
        int [] givenBirdTypeCount= {5,1,1,5,3,3,5,3,1};
        int max=0;


        for (int birdType:givenBirdTypeCount){
            birdTypes[birdType]++;
            max=Math.max(max,birdTypes[birdType]);
        }
        for (int i=0;i<birdTypes.length;i++) {
            if (birdTypes[i]==max) {
                System.out.println("en çok tekrar eden tür :"+i);
                break;
            }
        }
        System.out.println();
    }
}
