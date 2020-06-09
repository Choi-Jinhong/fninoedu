package Day_0609;

import java.sql.*;
import java.util.Scanner;

public class MysqlDb_01 {

    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/mysql";
    String user = "root";
    String password = "1111";

    public MysqlDb_01(){
        try {
            Class.forName(driver);
            System.out.println("mysql 연동 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("mysql 연동 실패 !!");
            e.printStackTrace();
        }
    }
//  1. Connection 생성
    public Connection getConnection(){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            System.out.println("db 연동 실패 !!");
            e.printStackTrace();
        }

        return conn;
    }
//  2. insert 생성
    public void insert(){
        Scanner sc = new Scanner(System.in);

        String name, major, grade;

        String sql = "";

        System.out.print("이름: ");
        name = sc.nextLine();
        System.out.print("학과: ");
        major = sc.nextLine();
        System.out.print("학년: ");
        grade = sc.nextLine();

        sql = "insert into univ values(null,?,?,?,now())";

        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
//          ?, ?, ? 인자값 완성
            pstmt.setString(1, name);
            pstmt.setString(2, major);
            pstmt.setString(3, grade);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//  3. select
    public void select(){
        System.out.println("No.\t\t학년\t\t이름\t\t학과\t\t수정날짜");
        System.out.println("-----------------------------------------------------------------------------------------------");

        String sql="select * from univ order by num asc";
        Connection conn = getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt("num")
                        + "\t\t" + rs.getString("grade")
                        + "\t\t" + rs.getString("name")
                        + "\t\t" + rs.getString("major")
                        + "\t\t" + rs.getDate("sdate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

//  4. Delete
    public void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 학번 입력: ");
        int n = Integer.parseInt(sc.nextLine());
        String sql = "delete from univ where num = '" + n + "'";

        Connection conn = getConnection();
        Statement stmt = null;

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("삭제 되었습니다.");
        } catch (SQLException e) {
            System.out.println("삭제에 실패하였습니다.");
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

//  5. update
    public void update(){
        Scanner sc = new Scanner(System.in);
        String name, major, grade, num;

        System.out.println("수정할 번호: ");
        num = sc.nextLine();
        System.out.println("수정할 이름: ");
        name = sc.nextLine();
        System.out.println("수정할 전공: ");
        major = sc.nextLine();
        System.out.println("수정할 학년: ");
        grade = sc.nextLine();

        String sql = "update univ set name = '" + name + "', major = '" + major + "', grade = '" + grade + "' where num = '" + num +"'";
        System.out.println(sql);

        Connection conn = getConnection();
        Statement stmt = null;

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MysqlDb_01 db = new MysqlDb_01();

        Scanner sc = new Scanner(System.in);
        int n = 0;

        while(true){
            System.out.println("1. insert 2. select 3.delete 4.update 0.exit");
            n = Integer.parseInt(sc.nextLine());
            if(n == 1)
                db.insert();
            else if(n == 2)
                db.select();
            else if(n == 3)
                db.delete();
            else if(n == 4)
                db.update();
            else if(n == 0){
                System.out.println("종료");
                break;
            }
        }
    }
}
