package Homework;


import java.sql.*;
import java.util.Scanner;

//제목은 DB_MySql_최진홍
public class QuizDb {

    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/mysql";
    String user = "root";
    String password = "1111";

    Scanner sc = new Scanner(System.in);

    public QuizDb(){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 연동 실패...");
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("DB 연동 실패...");
            e.printStackTrace();
        }

        return conn;
    }

    public void insert(){
        String name, group, title, context;

        System.out.print("작성자 이름: ");
        name = sc.nextLine();
        System.out.print("작성자 소속: ");
        group = sc.nextLine();
        System.out.print("게시글 제목: ");
        title = sc.nextLine();
        System.out.print("게시글 내용: ");
        context = sc.nextLine();

        String sql = "INSERT INTO program values(null, '" + name + "', '" + group + "', '" + title + "', '" + context + "', now())";
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

//  2. 조회하기
    public void select(){
        Connection conn = getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * from program";

        System.out.println("---------------------------------[혁신성장 게시판]--------------------------------------");
        System.out.println("No.\t\t\t이름\t\t\t소속\t\t\t제목\t\t\t내용\t\t\t작성일자");
        System.out.println("----------------------------------------------------------------------------------------");

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt("num")
                            + "\t\t\t" + rs.getString("name")
                            + "\t\t\t" + rs.getString("progroup")
                            + "\t\t" + rs.getString("protitle")
                            + "\t\t\t" + rs.getString("procontext")
                            + "\t\t" + rs.getDate("sdate"));
            }
        } catch (SQLException e) {
            System.out.println("조회 실패...");
            e.printStackTrace();
        }finally{
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

//  3. 삭제하기
    public void delete(){
        Connection conn = getConnection();
        Statement stmt = null;
        int choice;
        String sql = "";

        System.out.print("삭제 번호 입력: ");
        choice = Integer.parseInt(sc.nextLine());

        sql = "DELETE FROM program WHERE num = '" + choice + "'";

        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("삭제 완료");
        } catch (SQLException e) {
            System.out.println("삭제 실패");
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
//  4. 변경하기
    public void update(){
        Connection conn = getConnection();
        Statement stmt = null;
        int choice;
        String sql = "";
        String name, group, title, context;

        System.out.print("변경할 게시글 번호: ");
        choice = Integer.parseInt(sc.nextLine());
        System.out.print("변경할 작성자명: ");
        name = sc.nextLine();
        System.out.print("변경할 소속: ");
        group = sc.nextLine();
        System.out.print("변경할 제목: ");
        title = sc.nextLine();
        System.out.print("변경할 내용: ");
        context = sc.nextLine();

        sql = "UPDATE program SET name = '" + name
                + "', progroup = '"+ group
                + "', protitle = '" + title
                + "', procontext =  '" + context
                + "' WHERE num = '" + choice + "'";
        System.out.println(sql);
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("수정 완료");
        } catch (SQLException e) {
            System.out.println("수정 실패");
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
        QuizDb db = new QuizDb();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--------------[기능 선택]--------------");
            System.out.println("입력(1) 출력(2) 삭제(3) 변경(4) 종료(0)");
            System.out.print("기능 선택: ");
            int choice = Integer.parseInt(sc.nextLine());
            if(choice == 1)
                db.insert();
            else if(choice == 2)
                db.select();
            else if(choice == 3)
                db.delete();
            else if(choice == 4)
                db.update();
            else if(choice == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
