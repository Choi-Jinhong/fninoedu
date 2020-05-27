package Day_0527;

import java.util.Scanner;

public class IfTest_04 {
    public static void main(String[] args) {
/*      if
//      if(조건문){ ----------> 조건문이 참일 경우 {}을 실행
//
//      }
        else if(조건문){ -----> if의 조건문에서 false가 나온 값 중 해당 조건문이 참일 경우 {}를 실행

        }
        else{ ----------------> 모든 조건문이 만족하지 않을 경우 {}을 실행

        }
*/
        Scanner sc = new Scanner(System.in);

        int n = 10;
        if(n > 5){
            System.out.println("n은 5보다 크다");
        }
        System.out.println("종료");

//      홀수가 입력되면 홀수, 짝수가 입력되면 짝수 출력
        System.out.print("숫자를 입력하세요.");
        n = sc.nextInt();
        if(n % 2 == 1)
            System.out.println("홀수");
        else
            System.out.println("짝수");
    }
}
