package Day_0529;

import java.util.Scanner;

public class ForWhileReview_00 {
    public static void main(String[] args) {
        review_1();
        review_2();
    }
    public static void review_1(){
        for(int i = 1; i <= 10; i++){
            if(i % 3 == 0)
                continue;
            else
                System.out.print(i + " ");
        }
    }

    public static void review_2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++)
            sum += i;

        System.out.println("1 ~ " + n + "까지의 합은 " + sum + "입니다.");
    }
}
