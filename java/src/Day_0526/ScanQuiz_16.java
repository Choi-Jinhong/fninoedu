package Day_0526;

import java.util.Calendar;
import java.util.Scanner;

public class ScanQuiz_16 {
    public static void main(String[] args) {
//      1. import
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

//      2. 입력값
        System.out.print("태어난 연도는?");
        int myYear = Integer.parseInt(sc.nextLine()); // sc.nextLine()이 키보드의 엔터를 먼저 읽어주게 됨(nextInt()를 사용할 경우 버퍼 발생으로 값을 받을 수 없음)
        System.out.print("이름은?");
        String name = sc.nextLine();
        System.out.print("핸드폰 번호는?");
        String phone = sc.nextLine();
        System.out.print("주소는?");
        String addr = sc.nextLine();

//      3. 계산
        int age = cal.get(cal.YEAR) - myYear +1;

//      4. 결과값 출력
        System.out.println("===================================");
        System.out.println("이름: " + name);
        System.out.println("태어난 연도: " + myYear);
        System.out.println("나이: " + age + "세");
        System.out.println("전화번호: " + phone);
        System.out.println("주소: " + addr);
    }
}
