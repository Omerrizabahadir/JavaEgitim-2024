package org.example;

public class Main {
    public static void main(String[] args) {
        InsertData insertData=new InsertData();
        insertData.insertData();
        FourthdbReader fourthdbReader=new FourthdbReader();
        fourthdbReader.readDataAndWriteFile();
    }
}
