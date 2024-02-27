package algorithyms_homeworh05_find_repeated_character_with_02.way;

public class FindCharacterLength {
    public static void main(String[] args) {


        String s = "aba";
        long n = 1000000000000L;

        long countOfCharacterInS = 0;   //sayaç


        for (int i=0;i<s.length();i++) {
            if(s.charAt(i)=='a'){
                countOfCharacterInS++;

            }
        }
        long repeats = n / s.length();
        long remainingChars = n % s.length();
        long remainingCountOfCharacter =0;      //karakterlerin sayacı

        for (int i=0;i<remainingChars;i++){
            if (s.charAt(i)=='a'){
                remainingCountOfCharacter++;

            }
        }
        long totalCountOfCharacter=(repeats * countOfCharacterInS)+ remainingCountOfCharacter;
        System.out.println("total count of a :"+totalCountOfCharacter);
    }
}