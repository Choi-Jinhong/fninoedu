package Day_0528;

import java.util.Scanner;

public class QuizDanScan_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dan = 0;
        while(true) {
            System.out.println("단을 입력해주세요. (종료: 0)");
            int n = sc.nextInt();
            for(dan = n; dan <= n; dan++){
                for(int j = 1; j <= 9; j++)
                    System.out.println(dan + " x " + j + " = " + dan*j);
                }
            if (n == 0)
                break;
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
