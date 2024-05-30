package maven_homework_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();
        Scanner scanner = new Scanner(System.in);


        try (Connection connection = postgresqlDbConnection.getConnection()) {
            //create table
            Customers.createCustomerTable();
            Products.createProductsTable();
            Orders.createOrdersTable();

            //add data
            Customers.insertCustomerTable(scanner);
            Products.insertProductsTable(scanner);
            Orders.insertOrdersTable(scanner);

            //(INNER) JOIN
            InnerJoinSql.getTablesInfoUsingInnerJoinSql();
            showCustomersProductOrders(scanner);



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showCustomersProductOrders(Scanner scanner) {
        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();
        System.out.println("Müşteri id'si girin : ");
        int customerId = scanner.nextInt();
        String customerProductOrdersSql = "SELECT c.customer_id,p.product_id,c.customer_name,p.product_name,o.quantity FROM orders o JOIN customers c ON o.customer_id=c.customer_id JOIN products p ON o.product_id=p.product_id WHERE c.customer_id=?";

        try (Connection connection = postgresqlDbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(customerProductOrdersSql)) {
            preparedStatement.setInt(1, customerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                String customerName = resultSet.getString("customer_name");
                String productName = resultSet.getString("product_name");
                int quantity = resultSet.getInt("quantity");

                System.out.println("customer_name : " + customerName + " product_name : " + productName + " orders quantity : " + quantity);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
