package profile.model;

import java.sql.*;
import java.util.Vector;

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

        String sql = "INSERT INTO profile VALUES(seq_pro.nextval, ?, ?, ?, ?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getBlood());
            pstmt.setString(3, dto.getHp());
            pstmt.setString(4, dto.getBirth());

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

    public Vector<ProfileDTO> getAllData(){
        Vector<ProfileDTO> list = new Vector<ProfileDTO>();
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM profile ORDER BY num ASC";

        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()){
                ProfileDTO dto = new ProfileDTO();
                dto.setNum(rs.getString("num"));
                dto.setName(rs.getString("name"));
                dto.setBlood(rs.getString("blood"));
                dto.setHp(rs.getString("hp"));
                dto.setBirth(rs.getString("birth"));

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

    public ProfileDTO getData(String num){
        ProfileDTO dto = new ProfileDTO();

        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM profile WHERE num = ?";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, num);
            rs=pstmt.executeQuery();

            while (rs.next()){
                dto.setNum(rs.getString("num"));
                dto.setName(rs.getString("name"));
                dto.setHp(rs.getString("hp"));
                dto.setBirth(rs.getString("birth"));
                dto.setBlood(rs.getString("blood"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public void profileUpdate(ProfileDTO dto){
        Connection conn = getConnection();
        PreparedStatement pstmt = null;

        String sql = "UPDATE profile SET name = ?, blood = ?, hp = ?, birth = ? WHERE num = ?";

        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getBlood());
            pstmt.setString(3, dto.getHp());
            pstmt.setString(4, dto.getBirth());
            pstmt.setString(5, dto.getNum());

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
        ProfileDAO dao=new ProfileDAO();
    }
}
