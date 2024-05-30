package maven_homework_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InnerJoinSql {

    public static void getTablesInfoUsingInnerJoinSql() {
        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();
        String innerJoinSql = "SELECT c.customer_name,p.product_name,o.quantity"+" FROM orders o"
                +" JOIN customers c ON o.customer_id=c.customer_id"
                +" JOIN products p ON o.product_id=p.product_id";
        try (Connection connection = postgresqlDbConnection.getConnection();
             PreparedStatement innerJoinStatement = connection.prepareStatement(innerJoinSql)) {

            ResultSet resultSet = innerJoinStatement.executeQuery();
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                int age = resultSet.getInt("age");
                String productName = resultSet.getString("product_name");
                int price = resultSet.getInt("price");
                String color = resultSet.getString("color");


                System.out.println("customer_id : " + customerId + " customer_name : "
                        + customerName + " customer age : " + age + " product_name : "
                        + productName + " product price : " + price + " color : " + color);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
