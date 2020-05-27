package Day_0527;

import java.util.Scanner;

public class QuizIfScan_08 {
    public static void main(String[] args) {
//      1. import
        Scanner sc = new Scanner(System.in);

//      2. 변수 선언
        int score;
        String score2, message;

//      3. 입력
        System.out.print("점수를 입력하세요.: ");
        score = sc.nextInt();

//      4. 계산
        if(score >= 90){
            message = "참 잘했어요.";
            score2 = "A";
        }
        else if(score >= 80){
            message = "좀 더 노력하세요.";
            score2 = "B";
        }
        else{
            message = "다음 기회에 ....";
            if(score >= 70)
                score2 = "C";
            else if(score >= 60)
                score2 = "D";
            else
                score2 = "F";
        }

//      5. 출력
        System.out.println("학점: " + score2);
        System.out.println("점수: " + score);
        System.out.println("------------------------------");
        System.out.println("평가 메세지: " + message);
    }
}
