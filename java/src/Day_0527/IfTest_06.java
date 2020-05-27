package Day_0527;

import java.util.Scanner;

public class IfTest_06 {
    public static void main(String[] args) {
//      1. import
        Scanner sc = new Scanner(System.in);

//      2. 변수 선언
        String name, result;
        int java, jsp, spring;
        double avg;

//      3. 입력
        System.out.println("이름을 입력하세요.");
        name = sc.nextLine();
        System.out.println("세과목의 점수를 차례로 입력하시오.");
        java = sc.nextInt();
        jsp = sc.nextInt();
        spring = sc.nextInt();

//      4. 계산
        avg = (double)((java + jsp + spring) / 3);
        if(avg >= 60 && java >= 40 && jsp >= 40 && spring >= 40)
            result = "합격";
        else
            result = "불합격";

//      5. 결과값 출력
        System.out.println("이름:" + name);
        System.out.println("3과목의 점수: " + java + ", " + jsp + ", " + spring);
        System.out.println("평균: " + avg);
        System.out.println("**합격 조건: 평균 60점이상, 각과목 모두 40점 이상이면 합격");
        System.out.println(name + "님은 " + result + "입니다.");
    }
}
