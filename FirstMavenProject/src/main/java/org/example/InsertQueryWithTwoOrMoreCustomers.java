package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQueryWithTwoOrMoreCustomers {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/thirddb";
        String username = "postgres";
        String password = "123456";


        //veritabanı bağlantı oluşturma
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            //INSERT sorgusu

            String insertSql = "insert into customers(customer_id,customer_name,contact_name,address,city,postal_code,country)values(?,?,?,?,?,?,?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertSql);

            //ilk müşteri kaydı
            insertStatement.setInt(1, 88);
            insertStatement.setString(2, "hasan");
            insertStatement.setString(3, "hsn");
            insertStatement.setString(4, "etimesgut");
            insertStatement.setString(5, "ankara");
            insertStatement.setString(6, "123");
            insertStatement.setString(7, "türkiye");
            insertStatement.addBatch();

            //ikinci müşteri
            insertStatement.setInt(1, 89);
            insertStatement.setString(2, "cem");
            insertStatement.setString(3, "cm");
            insertStatement.setString(4, "çankaya");
            insertStatement.setString(5, "ankara");
            insertStatement.setString(6, "0923");
            insertStatement.setString(7, "türkiye");
            insertStatement.addBatch();

            //batch işlemini çalıştır

            int[] affectedRows = insertStatement.executeBatch();
            System.out.println(affectedRows.length + " adet müşteri eklenmiştir.");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
