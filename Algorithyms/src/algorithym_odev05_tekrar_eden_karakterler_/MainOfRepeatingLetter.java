package algorithym_odev05_tekrar_eden_karakterler_;

public class MainOfRepeatingLetter {
    public static void main(String[] args) {
        FindRepeatingLetter findRepeatingLetter=new FindRepeatingLetter();
        String word=findRepeatingLetter.getWordFromUser();
        findRepeatingLetter.findRepeatingLetter(word);
    }
}
