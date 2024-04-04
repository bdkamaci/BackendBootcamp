package databaseConnection;

import java.sql.*;

public class DBConnect {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";


    public static void main(String[] args) {
        // 1st Way of Connecting into a DB
       /* Connection connect = null;
        String url = "jdbc:mysql://localhost/university?user=root&password=mysql";
        try {
            connect = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } */

        // 2nd Way of Cannecting into a DB
        Connection connect = null;
        String sql = "SELECT * FROM student";
        String insertSql = "INSERT INTO student (student_name, student_class) VALUES ('Mustafa Cetindag', 3)";
        String prepareStatementSql = "INSERT INTO student (student_name, student_class) VALUES (?, ?)";
        String deleteSql = "DELETE FROM student WHERE student_id = 4";
        String prSql = "DELETE FROM student WHERE student_id = ?";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement statement = connect.createStatement();
            /* ResultSet data = statement.executeQuery(sql);
            while (data.next()) {
                System.out.println("ID: " + data.getInt("student_id"));
                System.out.println("Name: " + data.getString("student_name"));
                System.out.println("Class: " + data.getInt("student_class"));
                System.out.println("+++++++++++++++++++++++++++++++++++++++");
            }
            System.out.println(statement.executeUpdate(insertSql)); */

            /* PreparedStatement prSt = connect.prepareStatement(prepareStatementSql);
            prSt.setString(1, "Ahmet");
            prSt.setInt(2, 1);
            prSt.executeUpdate();

            prSt.close(); */

            statement.executeUpdate(deleteSql);
            PreparedStatement prSt = connect.prepareStatement(prSql);
            prSt.setInt(1, 3);
            prSt.executeUpdate();

            statement.close();
            connect.close();
            prSt.close();

        } catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }

    }
}
