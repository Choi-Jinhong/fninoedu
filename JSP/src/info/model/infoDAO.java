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
        System.out.println("connection 체크하기");
        try {
            conn = DriverManager.getConnection(url, "gnong", "1234");
            System.out.println("check2");
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
    public static void main(String[] args) {
        infoDAO dao = new infoDAO();
    }
}
