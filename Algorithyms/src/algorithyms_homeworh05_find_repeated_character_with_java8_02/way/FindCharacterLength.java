package algorithyms_homeworh05_find_repeated_character_with_java8_02.way;

public class FindCharacterLength {
    public static void main(String[] args) {
        long n = 1000000000000L;
        String s = "aba";
        long countOfAInS = 0;


        //for döngüsününün yerine java8 de bunu yazdık
        long aCountInOneRepeat = s.chars().filter(ch -> ch == 'a').count();

        long repeats = n / s.length();
        long remainingChars = n % s.length();
        long remainingCountOfCharacterA = 0;

        for (int i = 0; i < remainingChars; i++) {
            if (s.charAt(i) == 'a') {
                remainingCountOfCharacterA++;

            }
        }
        long totalCountOfCharacterA = (repeats * countOfAInS) + remainingCountOfCharacterA;
        System.out.println("total count of a :" + totalCountOfCharacterA);
    }
}