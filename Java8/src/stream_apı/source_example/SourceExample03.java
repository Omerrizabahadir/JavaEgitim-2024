package stream_apı.source_example;

import java.util.regex.Pattern;

public class SourceExample03 {
    public static void main(String[] args) {

        //.splitAsStream("java 8 streams")  String ifadenin kelimelerini ayırıp yazar

        Pattern.compile(" ")
                .splitAsStream("java 8 streams")//
                .forEach(System.out::println);



    }
}
