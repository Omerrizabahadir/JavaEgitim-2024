package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class FourthdbReader {

    public void readDataAndWriteFile() {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/fourtdb";
        String username = "postgres";
        String password = "123456";


        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            String selectSql = "select * from persons";
            PreparedStatement selectStatement = connection.prepareStatement(selectSql);
            ResultSet resultSet = selectStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("e_mail");


                FileWriter file = new FileWriter("file_1.txt");
                BufferedWriter output = new BufferedWriter(file);
                while (resultSet.next()) {
                    resultSet.getInt("id");
                    resultSet.getString("name");
                    resultSet.getInt("age");
                    resultSet.getString("phone_number");
                    resultSet.getString("e_mail");


                    file.write("id :" + id + "\nname : " + name + "\nage : " + age + "\nphone number : " + phoneNumber + "\nemail : " + email);

                    file.close();
                }


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}