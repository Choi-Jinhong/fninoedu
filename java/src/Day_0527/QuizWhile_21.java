package Day_0527;

import java.util.Scanner;

public class QuizWhile_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int score;
        int totscore = 0;

        while(true) {
            System.out.println(num + "번째 점수를 입력하시오. (1 ~ 100)");
            score = sc.nextInt();
            if(score >= 1 && score <= 100) {
                totscore += score;
                num++;
            }
            else
                continue;
            if(num > 5)
                break;
        }
        System.out.println("====================");
        System.out.println("총합계: " + totscore);
    }
}
