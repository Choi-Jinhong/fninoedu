package profile.model;

import java.sql.*;

public class ProfileDAO {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";

    public ProfileDAO(){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println("오라클 연동 실패");
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, "gnong", "1234");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void profileInsert(ProfileDTO dto){
        Connection conn = getConnection();
        PreparedStatement pstmt = null;

        String sql = "INSERT INTO profile VALUES(seq_pro.nextval, ?, ?, ?, sysdate)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getBlood());
            pstmt.setString(3, dto.getHp());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ProfileDAO dao=new ProfileDAO();
    }
}
