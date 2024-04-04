package databaseConnection;

import java.sql.*;

public class DBConnectPractice {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connection = null;
        String sql = "SELECT * FROM employee";

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement statement =  connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("employee_id"));
                System.out.println("Name: " + resultSet.getString("employee_name"));
                System.out.println("Level: " + resultSet.getInt("employee_level"));
                System.out.println("Salary: " + resultSet.getInt("employee_salary"));
                System.out.println("+++++++++++++++++++++++++++++++++++++++");
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }

    }
}
