package Day_0526;

import java.util.Scanner;

public class ScannerTest_13 {
    public static void main(String[] args) {
//      Scanner : 문자열, 숫자를 입력 받을 때 import
        Scanner sc = new Scanner(System.in);

//      이름을 출력하기 위한 변수 선언
        String name;
        int age;
        int num1, num2;

//      입력 가이드
        System.out.print("이름을 입력하시오. ==> ");
        name = sc.nextLine();
        System.out.print("나이를 입력하시오. ==>");
        age = sc.nextInt();
        System.out.print("두 개의 수 입력 ==> ");
        num1 = Integer.parseInt(sc.next());  // 버퍼가 걸릴 경우 문자열로 형변환
        num2 = sc.nextInt();

//      출력
        System.out.println("[신상정보]");
        System.out.println("이름: " + name + "님");
        System.out.println("나이: " + age + "세");
        System.out.println("두 수의 합: " + (num1+num2));
    }
}