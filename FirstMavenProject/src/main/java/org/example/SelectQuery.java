package org.example;

import java.sql.*;

public class SelectQuery {
    public static void main(String[] args) {
        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();
        //SELECT sorgusu
        String selectSql = "select * from customers";

        try (Connection connection = postgresqlDbConnection.getConnection();
             PreparedStatement selectStatement = connection.prepareStatement(selectSql)) { //preparedstatement burada olursa close yapmaya gerek kalmıyor

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
