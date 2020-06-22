package myBoard.model;

import java.sql.*;
import java.util.Vector;

public class MyBoardDAO {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";

    public MyBoardDAO(){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
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

    public void mbInsert(MyBoardDTO dto){
        Connection conn = getConnection();
        PreparedStatement pstmt = null;

        String sql = "INSERT INTO myboard VALUES(seq_mb.nextval, ?, ?, ?, sysdate)";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getSubject());
            pstmt.setString(3, dto.getContent());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Vector<MyBoardDTO> getAllDate(){
        Vector<MyBoardDTO> list = new Vector<MyBoardDTO>();
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM myboard";

        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()){
                MyBoardDTO dto = new MyBoardDTO();
                dto.setName(rs.getString("name"));
                dto.setNum(rs.getString("num"));
                dto.setSubject(rs.getString("subject"));
                dto.setContent(rs.getString("content"));
                dto.setSdate(rs.getTimestamp("sdate"));

                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public MyBoardDTO getDate(String num){
        MyBoardDTO dto = new MyBoardDTO();
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM myboard WHERE  num = ?";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, num);
            rs = pstmt.executeQuery();

            while(rs.next()){
                dto.setName(rs.getString("name"));
                dto.setSubject(rs.getString("subject"));
                dto.setContent(rs.getString("content"));
                dto.setSdate(rs.getTimestamp("sdate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return dto;
    }

    public  void mbUpdate(MyBoardDTO dto){
        Connection conn = getConnection();
        PreparedStatement pstmt = null;

        String sql = "UPDATE myboard SET name = ?, subject = ?, content = ? WHERE num = ?";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getSubject());
            pstmt.setString(3, dto.getContent());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyBoardDAO dao = new MyBoardDAO();
    }
}