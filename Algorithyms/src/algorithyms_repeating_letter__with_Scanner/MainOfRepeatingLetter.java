package algorithyms_repeating_letter__with_Scanner;

public class MainOfRepeatingLetter {
    public static void main(String[] args) {
        FindRepeatingLetter findRepeatingLetter=new FindRepeatingLetter();
        String word=findRepeatingLetter.getWordFromUser();
        findRepeatingLetter.findRepeatingLetter(word);
    }
}
