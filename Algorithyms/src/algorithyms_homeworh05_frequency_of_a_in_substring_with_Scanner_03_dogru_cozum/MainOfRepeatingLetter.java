package algorithyms_homeworh05_frequency_of_a_in_substring_with_Scanner_03_dogru_cozum;

public class MainOfRepeatingLetter {
    public static void main(String[] args) {
        FindRepeatingLetter findRepeatingLetter = new FindRepeatingLetter();
        String repeatedString=findRepeatingLetter.getLettersFromUser();
        int repeat=findRepeatingLetter.getWordFromUser();
        findRepeatingLetter.writeLetterRepeatevely();
    }
}
