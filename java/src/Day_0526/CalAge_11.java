package Day_0526;

import java.util.Calendar;

public class CalAge_11 {
    public static void main(String[] args) {

        String name = "최진홍";
        int myYear = 1995;
//      1. 나이를 구하는데 현재 연도가 필요 -> Calendar import
        Calendar cal = Calendar.getInstance();
//      2 . 계산
        int age = cal.get(cal.YEAR) - myYear + 1;
//      3 . 출력
        System.out.println("[신상정보]");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
    }
}
