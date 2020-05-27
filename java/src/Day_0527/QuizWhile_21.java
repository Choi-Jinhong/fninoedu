package Day_0527;

import java.util.Scanner;

public class QuizWhile_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int score = 0;
        int totscore = 0;

        while(num <= 5) {
            System.out.println(num + "번째 점수를 입력하시오");
            score = sc.nextInt();
            totscore += score;
            num++;
        }
        System.out.println("====================");
        System.out.println("총합계: " + totscore);
    }
}
