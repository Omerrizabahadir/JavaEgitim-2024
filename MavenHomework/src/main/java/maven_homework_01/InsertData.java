package maven_homework_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
    PostgresqlDbConnection postgresqlDbConnection = new PostgresqlDbConnection();
    public void insertData() {


        try (Connection connection = postgresqlDbConnection.getConnection()) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("id :");
                int id = scanner.nextInt();
                System.out.println("isim :");
                String name = scanner.next();
                System.out.println("yaş :");
                int age = scanner.nextInt();
                System.out.println("telefon :");
                String phoneNumber = scanner.next();
                System.out.println("email :");
                String email = scanner.next();

                String insertSql = "insert into persons(id,name,age,phone_number,e_mail) values (?,?,?,?,?)";
                PreparedStatement insertStatement = connection.prepareStatement(insertSql);
                insertStatement.setInt(1, id);
                insertStatement.setString(2, name);
                insertStatement.setInt(3, age);
                insertStatement.setString(4, phoneNumber);
                insertStatement.setString(5, email);

                int affectedRow = insertStatement.executeUpdate();
                if (affectedRow > 0) {
                    System.out.println("Kişi bilgileri başarılı bir şekilde eklenmiştir");
                }
                System.out.println("Başka bir kişi kaydetmek ister misiniz? (yes/no)");

                String answerToConsole = scanner.next().toLowerCase();
                if (answerToConsole.equals("no")) {
                    System.out.println("kayıtlarınızı tablodan görebilirsiniz");
                    break;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

