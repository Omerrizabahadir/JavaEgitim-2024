package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQueryOnlyOneCustomer {
    //BİR TANE KAYIT YAPIYOR
    public static void main(String[] args) {
        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();

        try (Connection connection = postgresqlDbConnection.getConnection()) {
            String insertSql = "insert into customers (customer_id,customer_name,contact_name,address,city,postal_code,country) values (?,?,?,?,?,?,?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertSql);

            //veritabanı bağlantı oluşturma

            //INSERT
            insertStatement.setInt(1, 88); //Burdaki id kayıtlıyken çalıştırırsan aynı id var diye hata verecektir
            insertStatement.setString(2, "hasan");
            insertStatement.setString(3, "hkd");
            insertStatement.setString(4, "etimesgut");
            insertStatement.setString(5, "ankara");
            insertStatement.setString(6, "123");
            insertStatement.setString(7, "türkiye");

            int affectedRow = insertStatement.executeUpdate();

            System.out.println("insert işlemi başarılı toplamda insert adedi :" + affectedRow);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}