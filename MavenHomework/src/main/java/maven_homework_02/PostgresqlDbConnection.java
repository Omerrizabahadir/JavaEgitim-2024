package maven_homework_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresqlDbConnection {
    public Connection getConnection(){
        String jdbcUrl = "jdbc:postgresql://localhost:5432/fifthdb";
        String username = "postgres";
        String password = "123456";

        try {
            return DriverManager.getConnection(jdbcUrl,username,password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
