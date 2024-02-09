package study_continue_return_break;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0)  //continue sadece döngülerde kullanılacağından if in {}küme parantezini yapmayız
                continue;   //continue burada tam bölünenleri atla diyor.bu nedenle tek sayıları basacak

                System.out.print("\t " + i);
            }
        }

    }