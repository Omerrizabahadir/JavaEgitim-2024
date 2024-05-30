package maven_homework_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Orders {
    public static void createOrdersTable() {
        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();

        String createOrdersTableSql =
                "CREATE TABLE orders(order_id int not null PRIMARY KEY,customer_id int,product_id int,quantity int,order_date varchar(255),FOREIGN KEY (customer_id) REFERENCES customers (customer_id),FOREIGN KEY(product_id) REFERENCES products (product_id))";
        try (Connection connection = postgresqlDbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(createOrdersTableSql)) {
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void insertOrdersTable(Scanner scanner) {

        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();


        String insertOrdersTableSql = "INSERT INTO orders(order_id,quantity,order_date)VALUES(?,?,?)";

        while (true) {
            System.out.println("order_id : ");
            int orderId = scanner.nextInt();
            System.out.println("quantity of order : ");
            int quantity = scanner.nextInt();
            System.out.println("order date is : ");
            String orderDate = scanner.next();

            try (Connection connection = postgresqlDbConnection.getConnection();
                 PreparedStatement insertStatement = connection.prepareStatement(insertOrdersTableSql)) {

                insertStatement.setInt(1, orderId);
                insertStatement.setInt(2, quantity);
                insertStatement.setString(3, orderDate);
                insertStatement.executeUpdate();

                System.out.println("Başka bir sipariş bilgisi kaydetmek ister misiniz? (evet/hayır)");

                String answeringNewOrder = scanner.next();
                if (answeringNewOrder.equals("no")) {

                    break;

                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
