package Day_0526;

import java.util.Calendar;
import java.util.Date;

public class CalTest_10 {
    public static void main(String[] args) {
//      날짜 관련한 import
//      Date date = new Date(); -> 권장하지 않음

//      import -> 클래스명.getInstance();
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

//      출력
//      참조변수명.메소드로 필요한 메소드 활용
        System.out.println("지금은 " + cal.get(cal.YEAR) + "년도 입니다.");
        System.out.println((cal.get(cal.MONTH) + 1) + "월 입니다.");
        System.out.println("오늘은 " + cal.get(cal.DATE) + "입니다.");
        System.out.println("현재 시각은 " + cal.get(cal.HOUR) + ":" + cal.get(cal.MINUTE) + " 입니다.");
    }
}
