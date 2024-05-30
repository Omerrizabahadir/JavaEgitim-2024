package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateQuery {

    public static void main(String[] args) {
        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();
        String updateSql = "UPDATE products SET price=? WHERE product_name=? ";
        try (Connection connection = postgresqlDbConnection.getConnection();
             PreparedStatement updateStatement = connection.prepareStatement(updateSql)) {
            updateStatement.setDouble(1, 18.00);
            updateStatement.setString(2, "Chais");
            int affectedRow = updateStatement.executeUpdate();
            System.out.println("update sonrası güncellenen satır sayısı : " + updateStatement);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
