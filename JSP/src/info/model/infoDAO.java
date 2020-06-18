package info.model;

import java.sql.*;
import java.util.Vector;

public class infoDAO {
    String driver="oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";

    public infoDAO(){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println("oracle fail");
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, "gnong", "1234");
        } catch (SQLException e) {
            System.out.println("connection fail");
            e.printStackTrace();
        }
        return conn;
    }

    public void infoInsert(infoDTO dto){
        Connection conn = getConnection();
        PreparedStatement pstmt = null;

        String sql = "insert into info values(seq_info.nextval, ?, ?, sysdate)";

        try {
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getAddr());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Vector<infoDTO> getAllDatas(){
        Vector<infoDTO> list = new Vector<infoDTO>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from info order by num asc";

        conn = getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            //여러개의 데이터 얻기
            while(rs.next()){
                infoDTO dto = new infoDTO();
                dto.setNum(rs.getString("num"));
                dto.setName(rs.getString("name"));
                dto.setAddr(rs.getString("addr"));
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

    public infoDTO getData(String num){
        infoDTO dto = new infoDTO();

        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql="select * from info where num = ?";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, num);
            rs = pstmt.executeQuery();

            if(rs.next()){
                dto.setNum(rs.getString("num"));
                dto.setName(rs.getString("name"));
                dto.setAddr(rs.getString("addr"));
                dto.setSdate(rs.getTimestamp("sdate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
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

    public void infoUpdate(infoDTO dto){
        Connection conn = getConnection();
        PreparedStatement pstmt = null;

        String sql="UPDATE info SET name = ?, addr = ? WHERE num = ?";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getAddr());
            pstmt.setString(3, dto.getNum());
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

    public void infoDelete(infoDTO dto){
        Connection conn = getConnection();
        PreparedStatement pstmt = null;

        String sql = "DELETE FROM info WHERE num = ?";

        try {
            pstmt= conn.prepareStatement(sql);
            pstmt.setString(1, dto.getNum());
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
        infoDAO dao = new infoDAO();
    }
}
