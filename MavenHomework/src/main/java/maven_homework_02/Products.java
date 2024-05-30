package maven_homework_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Products {
    public static void createProductsTable() {
        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();
        String createProductsTableSql = "CREATE TABLE products(product_id int not null PRIMARY KEY,product_name VARCHAR(255),price int, color varchar(255))";
        try (Connection connection = postgresqlDbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(createProductsTableSql)) {
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertProductsTable(Scanner scanner) {
        PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();


        String insertProductsTableSql = "INSERT INTO products(product_id,product_name,price,color)VALUES(?,?,?,?)";

        System.out.println("Ürün bilgilerini giriniz ");
        while (true) {
            System.out.println("product_id : ");
            int productId = scanner.nextInt();
            System.out.println("product_name : ");
            String productName = scanner.next();
            System.out.println("price : ");
            int price = scanner.nextInt();
            System.out.println("color : ");
            String color = scanner.next();

            try (Connection connection = postgresqlDbConnection.getConnection();
                 PreparedStatement insertStatement = connection.prepareStatement(insertProductsTableSql)) {

                insertStatement.setInt(1, productId);
                insertStatement.setString(2, productName);
                insertStatement.setDouble(3, price);
                insertStatement.setString(4, color);
                insertStatement.executeUpdate();

                System.out.println("Başka bir ürün kaydetmek ister misiniz? (evet/hayır)");

                String answeringNewProduct = scanner.next();
                if (answeringNewProduct.equals("no")) {

                    break;

                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}