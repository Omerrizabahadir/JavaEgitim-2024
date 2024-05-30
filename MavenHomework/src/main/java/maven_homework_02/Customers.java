package maven_homework_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Customers {
    public static void createCustomerTable() {
        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();
        String createCustomersTableSql = "CREATE TABLE customers(customer_id int not null primary key,customer_name varchar(255),age int,e_mail varchar(255))";

        try (Connection connection = postgresqlDbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(createCustomersTableSql)) {

            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertCustomerTable(Scanner scanner) {
        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();

        String insertCustomerTableSql = "INSERT INTO customers(customer_id,customer_name,age,e_mail)VALUES(?,?,?,?)";

        System.out.println("Müşteri bilgilerini giriniz ");
        while (true) {
            System.out.println("customer_id : ");
            int customerId = scanner.nextInt();
            System.out.println("customer_name : ");
            String customerName = scanner.next();
            System.out.println("customer age : ");
            int age = scanner.nextInt();
            System.out.println("customer email : ");
            String email = scanner.next();


            try (Connection connection = postgresqlDbConnection.getConnection();
                 PreparedStatement insertStatement = connection.prepareStatement(insertCustomerTableSql)) {

                insertStatement.setInt(1, customerId);
                insertStatement.setString(2, customerName);
                insertStatement.setInt(3, age);
                insertStatement.setString(4, email);

                insertStatement.executeUpdate();

                System.out.println("Başka bir müşteri kaydetmek ister misiniz? (evet/hayır)");

                String answeringNewCustomer = scanner.next();
                if (answeringNewCustomer.equals("no")) {

                    break;

                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
