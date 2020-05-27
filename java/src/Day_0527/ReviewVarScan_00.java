package Day_0527;

import java.util.Calendar;
import java.util.Scanner;

public class ReviewVarScan_00 {
    public static void main(String[] args) {
//      1. import
        Scanner sc= new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

//      2. 입력
        System.out.print("상품명을 입력하시오. ------>");
        String thing = sc.nextLine();
        System.out.print("단가를 입력하시오. -------->");
        int price = sc.nextInt();
        System.out.print("수량을 입력하시오. -------->");
        int n = sc.nextInt();

//      3. 계산
        int total = price * n;

//      4. 출력
        System.out.println("---------------------------");
        System.out.println(cal.get(cal.YEAR) + "년 " + (cal.get(cal.MONTH) + 1) + "월 " + cal.get(cal.DATE) + "일");
        System.out.println("---------------------------");
        System.out.println("상품명: " + thing);
        System.out.println("단가: " + price);
        System.out.println("총액: " + total);
    }
}
