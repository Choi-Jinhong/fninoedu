package Day_0527;

import java.util.Scanner;

public class IfTest_05 {
    public static void main(String[] args) {
//      1. import
        Scanner sc = new Scanner(System.in);

//      2. 변수 선언
        int score;
        String grade;

//      3. 입력
        System.out.print("학점을 입력하세요");
        score = sc.nextInt();

//      4. 조건 계산
        if(score >= 90)
            grade = "A";
        else if(score >= 80)
            grade = "B";
        else if(score >= 70)
            grade = "C";
        else if(score >= 60)
            grade = "D";
        else
            grade = "F";

//      5. 결과 출력
        System.out.println("해당 학생의 학점은 "+ grade + "입니다.");
    }
}
