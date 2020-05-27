package Day_0527;

import java.util.Scanner;

public class ReturnTest_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        System.out.println("입력점수(1~!00까지만 입력가능");
        score = sc.nextInt();

//      잘못 입력한 경우 if문으로 null값 체크
        if(score < 1 || score > 100) {
            System.out.println("입력이 잘못 되었습니다.");
            return;
        }
        else
            System.out.println("점수: " +score);
    }
}
