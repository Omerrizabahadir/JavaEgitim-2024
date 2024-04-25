package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteQuery {
    public static void main(String[] args) {
        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();

        int customerId = getWillDeleteCustomerId();

        //DELETE sorgusu
        String deleteSql = "delete from customers where customer_id=?"; //? ile parametrik yaptı istediğini silersin

        try (Connection connection = postgresqlDbConnection.getConnection();
             PreparedStatement deleteStatement = connection.prepareStatement(deleteSql)) {   //preparedstatement burada olursa close yapmaya gerek kalmıyor

            deleteStatement.setInt(1, customerId);
            int affectedRow = deleteStatement.executeUpdate();
            System.out.println("delete işlemi sonucunda etkilenen satır sayısı :  " + affectedRow);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static int getWillDeleteCustomerId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("silinmesini istediğiniz customer_id 'yi giriniz !");
        return scanner.nextInt();
    }
}
