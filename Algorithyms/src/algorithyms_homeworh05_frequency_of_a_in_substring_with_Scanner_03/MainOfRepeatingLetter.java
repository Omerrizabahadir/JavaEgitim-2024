package algorithyms_homeworh05_frequency_of_a_in_substring_with_Scanner_03;

public class MainOfRepeatingLetter {
    public static void main(String[] args) {
        FindRepeatingLetter findRepeatingLetter=new FindRepeatingLetter();
        String word=findRepeatingLetter.getWordFromUser();
        findRepeatingLetter.findRepeatingLetter(word);
    }
}
