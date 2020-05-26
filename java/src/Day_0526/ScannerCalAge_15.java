package Day_0526;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerCalAge_15 {
    public static void main(String[] args) {
//      1. import
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

//      2. 정보 입력
        System.out.print("이름입력: ");
        String name = sc.nextLine();
        System.out.print("태어난 연도 입력: ");
        int myYear = sc.nextInt();

//      3. 나이 계산
        int age = cal.get(cal.YEAR) - myYear + 1;

//      4. 입력값 출력
        System.out.println("=========================");
        System.out.println("[신상정보]");
        System.out.println("이름: " + name);
        System.out.println("현재 나이: " + age + "세");
    }
}
