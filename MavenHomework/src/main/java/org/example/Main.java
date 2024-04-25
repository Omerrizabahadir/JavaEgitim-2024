package org.example;

public class Main {
    /*
    Getting user information using a scanner,
    adding this information to the table with insert,
    and reading it with select and printing it to a txt file)

    postgresql 'de tablo oluşturup, tablonun içerisine age,name... gibi sütunlar(column lar ekle)
    java tarafında maven projesi oluşturup dependency'yi pom.xml'e ekle
    Scanner kullanarak kullanıcıdan column bilgilerini al (age,name...)
    bu bilgileri tabloya INSERT et.
    Insert sonrası başka bir class'ta bu değerleri select ile okuyup bu bilgileri txt dosyasına at
    (ÖR: customer.txt dosya adı olsun)
     */
    public static void main(String[] args) {
        InsertData insertData = new InsertData();
        insertData.insertData();
        FourthdbReader fourthdbReader = new FourthdbReader();
        fourthdbReader.readDataAndWriteFile();
    }
}
