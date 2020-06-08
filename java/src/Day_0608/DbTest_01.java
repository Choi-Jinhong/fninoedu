package Day_0608;

import java.sql.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DbTest_01 {

    //드라이버,url
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";

    //생성자
    public DbTest_01() {
        try {
            Class.forName(driver);
            System.out.println("오라클 드라이버 성공!!!");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("오라클드라이버 실패");
        }
    }

    public Connection getConnection()
    {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, "gnong", "1234");//각각의 계정과 password
//            System.out.println("db 연동성공!!!");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
//            System.out.println("db 연동실패!!");
            e.printStackTrace();
        }

        return conn;

    }
//  1. insert
    public void insert()
    {
        Scanner sc = new Scanner(System.in);

        String name,addr;
        String sql;  //insert sql작성을 위한 변수

        System.out.println("이름을 입력하세요");
        name = sc.nextLine();
        System.out.println("주소를 입력하세요");
        addr = sc.nextLine();

        sql = "insert into hello values(seq_h.nextval, '" + name + "', '" + addr + "', sysdate)";
        System.out.println(sql);

        //1.db연결
        Connection conn = null;

        //2.statement
        Statement stmt = null;

        conn=getConnection();
        try {
            stmt = conn.createStatement();
            //sql문 전송에 필요한 statement객채를 createStatement객체를 통해 얻는다
            //sql문 실행...insert문
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("insert 에러: "+e.getMessage());
        }finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }
//  2. select
//    - ResultSet이 필요 !!
//    - select문을 요청하므로 executeQuery메소드를 이용하여 ResultsSt 객체로 값을 얻음
    public void select(){
        System.out.println("no.\t\t이름\t\t주소\t\t현재날짜");
        System.out.println("----------------------------------------------------------------");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null; // 조회시 테이블 형태로 출력해주는 객체
        String sql = "select * from hello order by num asc";

        conn = getConnection();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
//          2개 이상의 값을 얻고자 할 때는 While문 사용
            while (rs.next()){ // rs.next(): 가지고 있는 다음 값이 없을 떄까지 true 반환
                System.out.println(rs.getInt("num") + "\t\t" // 숫자형 컬럼명
                        + rs.getString("name") + "\t\t" // 글자형 컬럼명
                        + rs.getString("addr") + "\t\t"
                        + rs.getDate("sdate")); // 날짜형 컬럼명
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
//  3. delete
    public void delete(){
        Connection conn = getConnection();
        Statement stmt = null;

        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제하실 데이터를 입력해주세요(이름): ");
        name = sc.nextLine();

        String sql = "delete from hello where name = '" + name + "'";
        System.out.println(sql);
        try {
            stmt = conn.createStatement();
            int a = stmt.executeUpdate(sql);

            if(a == 0)
                System.out.println("없는 데이터 입니다.");
            else
                System.out.println("삭제가 완료되었습니다.");

        } catch (SQLException e) {
            System.out.println("delete 에러");
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

//  4. Update
    public void update(){
        Connection conn = getConnection();
        Statement stmt = null;

        String sql = null;
        String choice;
        Scanner sc = new Scanner(System.in);

        System.out.print("변경하고자 하는 것을 선택해주세요.(이름 or 주소): ");
        choice = sc.nextLine();
        System.out.print("변경 전 내용과 변경 후 내용을 입력해주세요.");
        StringTokenizer st= new StringTokenizer(sc.nextLine());
        String bfcontext = st.nextToken();
        String afcontext = st.nextToken();

        if(choice.equals("이름")){
            sql = "UPDATE hello SET name = '" +  afcontext + "' WHERE name = '" + bfcontext + "'";
        }
        else if(choice.equals("주소")){
            sql = "UPDATE hello SET addr = '" + afcontext + "' WHERE addr = '" + bfcontext + "'";
        }

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
        // TODO Auto-generated method stub

        DbTest_01 db = new DbTest_01();

        //메인함수에 데이터 추가를 할수있게 조건문 지정

        Scanner sc = new Scanner(System.in);
        int choice = 0; //1,2,3,4,종료 선택할 변수

        while(true)
        {
            System.out.println("1.insert 2.select 3.delete 4.update 0.종료");
            choice = Integer.parseInt(sc.nextLine());

            if(choice == 1)
                db.insert();
            else if(choice == 2)
                db.select();
            else if(choice == 3)
                db.delete();
            else if(choice == 4)
                db.update();
            else if(choice == 0)
            {
                System.out.println("종료!!");
                break;
            }
        }
    }
}
