package Day_0603;

import java.util.Scanner;

public class ExceptionTrows_11 {
    public static void main(String[] args) {
//      사용자 정의 예외처리
//      예외가 발생할 경우가 아닙에도 불구하고 조건에 해당하면 강제로 예외처리
//      throw / throws
//      throws: 호출한 영역으로 예외처리를 던짐
//      throw: 강제로 예외 발생
        try {
            scoreInput();
        } catch (Exception e) {
            System.out.println("오류메세지: " + e.getMessage());
        }
        System.out.println("정상종료");
    }
    public static void scoreInput() throws Exception{
//      점수가 0 ~ 100 사이가 아니면 예외 처리
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("점수를 입력하시오.");
        score = sc.nextInt();
        if(score < 0 || score > 100){
            throw new Exception("점수가 잘못 입력되었습니다.");
        }
        else{
            System.out.println("나의 점수는 " + score + "입니다.");
        }
    }
}
