package algorithyms_homeworks04_absolute_value_array;

public class AbsoluteValueOfArrayNumbers {
    public static void main(String[] args) {
        AbsoluteValueOfArrayNumbers absoluteValueOfArrayNumbers = new AbsoluteValueOfArrayNumbers();
        int[] arrays = new int[6];
        int[] givenSubArraysCount = {1, 1, 2, 2,3, 4, 4, 5, 5, 5,4};
        int findAbsolute = absoluteValueOfArrayNumbers.findAbsoluteValueOfGivenArray(arrays, givenSubArraysCount);
        System.out.println("En uzun alt dizi : " + findAbsolute);
    }

    public int findAbsoluteValueOfGivenArray(int[] arrays, int[] givenSubArraysCount) {
        int abs = 0;
        for (int array : givenSubArraysCount) {
            arrays[array]++;
            abs = Math.abs(arrays[array]);
        }
        for (int i = 0; i <arrays.length; i++) {
            if (arrays[i] == abs) {
                return i;
            }
        }
        return abs;
    }

}
