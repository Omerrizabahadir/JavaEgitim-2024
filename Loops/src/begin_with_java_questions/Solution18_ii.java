package begin_with_java_questions;

public class Solution18_ii {
    //ii)
    //*
    //**
    //***
    //** * *
    //**** *

    public static void main(String[] args) {

        Solution18_ii solution18_ii=new Solution18_ii();
        solution18_ii.sekliYap();
    }
    public void sekliYap(){

        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
