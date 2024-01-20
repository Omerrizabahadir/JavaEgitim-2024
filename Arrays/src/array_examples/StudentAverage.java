package array_examples;

import java.util.Arrays;

public class StudentAverage {
    //Öğrencilerin almış olduğu notların ortalaması hesaplayan bir ortalama methodu yazın.
    // Notları dizi içerisinde tutup methoda diziyi gönderin.
    public static void main(String[] args) {

        int[]notes={90,67,87,83,56,75,80};
        System.out.println("Notlar dizisi :"+ Arrays.toString(notes));
        System.out.println("Dizindeki notların ortalaması :"+average(notes));
    }
    public static double average(int[]notes){
        int average=0;
        for (int i=0;i<notes.length;i++){
            average=average+notes[i];

        }
        average=average/notes.length;
        return average;
    }
}
