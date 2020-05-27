package Day_0527;

import java.util.Scanner;

public class IfTest_07 {
    public static void main(String[] args) {
//      *삼항연산자
//       : 수식?참:거짓

//      1. import
        Scanner sc = new Scanner(System.in);

//      2. 변수 선언
        int x, y, max;

//      3. 입력
        System.out.println("두 개의 숫자를 입력해주세요.");
        x = sc.nextInt();
        y = sc.nextInt();

//      4. 계산
/*
        if(x >= y)
            max = x;
        else
            max = y;
 */
        max = x >= y ? x : y;

//      5. 결과값 출력
        System.out.println("두 수중 더 큰 값은 " + max + "입니다.");
    }
}
