package Day_0608;

import java.sql.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DbDriver_02 {

    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";

//  1. 생성자 생성
    public DbDriver_02(){
        try {
            Class.forName(driver);
            System.out.println("오라클 연동 성공!!");
        } catch (ClassNotFoundException e) {
            System.out.println("오라클 연동 실패 ㅠㅠ");
            e.printStackTrace();
        }
    }

    public Connection getDbDriver(){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, "gnong", "1234");
        } catch (SQLException e) {
            System.out.println("DB 연동 실패 ㅠㅠ");
            e.printStackTrace();
        }

        return conn;
    }

    public void insert(){
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        String sql = "";

        Connection conn = null;
        Statement stmt = null;
        System.out.println("새로운 정보를 입력해주세요.(이름, 나이, 주소)");
        st = new StringTokenizer(sc.nextLine());
        sql = "INSERT INTO member values(seq_mem.nextval, '" + st.nextToken() + "', '" + st.nextToken() + "세', '" + st.nextToken() + "', sysdate)";
        System.out.println(sql);

        conn = getDbDriver();
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("sql 실행 실패ㅠㅠ");
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

    public void select(){

        System.out.println("no.\t\t이름\t\t나이\t\t주소\t\t현재날짜");
        System.out.println("----------------------------------------------------------------");

        Connection conn = getDbDriver();
        Statement stmt = null;
        ResultSet rs = null;

        String sql = "select * from MEMBER";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getInt("no") + "\t\t"
                        + rs.getString("name") + "\t\t"
                        + rs.getString("age") + "\t\t"
                        + rs.getString("addr") + "\t\t"
                        + rs.getDate("sdate"));
            }
        } catch (SQLException e) {
            System.out.println("조회 실패 ㅠㅠ");
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

    public void delete(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String sql = "";

        System.out.println("삭제하실 index를 입력해주세요.");
        n = Integer.parseInt(sc.nextLine());
        sql = "delete from member where no = " + n;

        Connection  conn = getDbDriver();
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("해당 인덱스의 내용이 삭제되었습니다.");
        } catch (SQLException e) {
            System.out.println("삭제를 실패했습니다.");
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

    public void update(){
        Scanner sc = new Scanner(System.in);
        System.out.println("변경하실 index의 번호를 입력해주세요.");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("변경 내용을 입력해주세요.");
        StringTokenizer st =new StringTokenizer(sc.nextLine());

        String sql = "UPDATE member SET name = '" + st.nextToken() + "', age = '" + st.nextToken() + "', addr = '" + st.nextToken() + "', sdate = sysdate where no = " + n;
        System.out.println(sql);

        Connection conn = getDbDriver();
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("변경이 완료 되었습니다.");
        } catch (SQLException e) {
            System.out.println("변경을 실패하였습니다 ㅠㅠ");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DbDriver_02 db2 = new DbDriver_02();

        Scanner sc = new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("사용할 기능을 선택해주세요. ");
            System.out.println("1) 입력 2) 출력 3) 삭제 4) 변경 9) 종료");
            choice = Integer.parseInt(sc.nextLine());
            if(choice == 1)
                db2.insert();
            else if(choice == 2)
                db2.select();
            else if(choice == 3)
                db2.delete();
            else if(choice == 4)
                db2.update();
            else if(choice == 9) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
