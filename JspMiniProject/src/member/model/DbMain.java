package member.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbMain {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";

    public DbMain(){
        try {
            Class.forName(driver);
            System.out.println("oracle Success");
        } catch (ClassNotFoundException e) {
            System.out.println("oracle Fail");
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, "gnong", "1234");
            System.out.println("DB Success");
        } catch (SQLException e) {
            System.out.println("DB Fail");
            e.printStackTrace();
        }

        return conn;
    }

    public static void main(String[] args) {
        DbMain db = new DbMain();
        db.getConnection();
    }
}
