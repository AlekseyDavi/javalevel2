package Lesson7;

import java.sql.*;

public class Archive {


    public static void outputResultArchive(String town) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:geekbrains.db");
            statement = connection.createStatement();
            String requestData = "select * from temperatureArchive where town = '" + town + "'";
            ResultSet resultSet = statement.executeQuery(requestData);
            while (resultSet.next()) {
                System.out.print(resultSet.getString("data"));
                System.out.print(" ");
                System.out.print(resultSet.getString("temperatureMin"));
                System.out.print(" ");
                System.out.println(resultSet.getString("temperatureMax"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}

