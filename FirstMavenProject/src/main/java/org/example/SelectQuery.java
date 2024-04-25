package org.example;

import java.sql.*;

public class SelectQuery {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/thirddb";
        String username = "postgres";
        String password = "123456";


        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            //SELECT sorgusu

            String selectSql = "select * from customers";
            PreparedStatement selectStatement = connection.prepareStatement(selectSql);

            /*tablonun çıktısının sonucunu dönmesi için sonuç döndür dicez,
            delete,update ve insert hepsi için executeUpdate() kullanılır
            select için executeQuerry() kullanılır.
             */
            ResultSet resultSet = selectStatement.executeQuery();
            while (resultSet.next()) {   //db'den gelen sonuç fazla olacağından döngü ile alacaz
                //db'deki customers tablosunun column'larını ekleyecez

                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String country = resultSet.getString("country");

                System.out.println("\nCustomer_id : " + customerId);
                System.out.println("customer_name : " + customerName);
                System.out.println("country : " + country);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
