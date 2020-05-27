package Day_0527;

import java.util.Calendar;
import java.util.Scanner;

public class BirthYearDdi_12 {
    public static void main(String[] args) {
//      태어난 연도 입력해서 나이, 띠도 구분
//      띠 구할 떄의 로직은 원숭이띠부터

//      1. import
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

//      2. 변수 선언
        int myYear, age;
        String name, ddi;

//      3. 입력
        System.out.println("이름을 입력하세요.");
        name = sc.nextLine();
        System.out.println("태어난 연도를 입력하세요.");
        myYear = sc.nextInt();

//      4. 계산
        age = cal.get(cal.YEAR) - myYear + 1;
        ddi=myYear%12==0?"원숭이":
                myYear%12==1?"닭":
                        myYear%12==2?"개":
                                myYear%12==3?"돼지":
                                        myYear%12==4?"쥐":
                                                myYear%12==5?"소":
                                                        myYear%12==6?"호랑이":
                                                                myYear%12==7?"토끼":
                                                                        myYear%12==8?"용":
                                                                                myYear%12==9?"뱀":
                                                                                        myYear%12==10?"말":"양";

//      5. 출력
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("띠: " + ddi);
    }
}
