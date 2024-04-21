package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {

    public  void insertData() {

        String jdbcUrl = "jdbc:postgresql://localhost:5432/fourtdb";
        String username = "postgres";
        String password = "123456";


        {
            try {
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                Scanner scanner = new Scanner(System.in);
                boolean isContinue = true;

                while (isContinue) {
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
                    isContinue = false;
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
    }
