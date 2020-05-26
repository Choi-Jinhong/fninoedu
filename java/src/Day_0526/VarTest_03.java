package Day_0526;

import jdk.jfr.Unsigned;

public class VarTest_03 {
    public static void main(String[] args) {
//      변수는 메모리 공간의 할당과 접근 -> 두가지 문제를 해결하기 위해 도입
//      변수선언 -> 메모리 공간 할당 -> 접근을 위한 이름을 지정
//      자료형 참조변수명 = 값;
        int num1 = 20;

//      자료형 참조변수명;
//      참조변수명 = 값;
        int num2;
        num2 = 50;

//      자료형 참조변수3 = 참조변수1 + 참조변수2;
        int add = num1 + num2;

//      출력
        System.out.println("두 숫자의 값은 " + num1 + "," + num2);
        System.out.println("두 숫자의 합은" + num1 + num2 + "입니다.");
        System.out.println("두 숫자의 합은" + add +"입니다.");
    }
}