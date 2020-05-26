package Day_0526;

import java.util.Scanner;

public class ScannerScore_14 {
    public static void main(String[] args) {
//      1. Scanner 생성
        Scanner sc = new Scanner(System.in);

//      2. 정보 입력
        System.out.print("당신의 이름은?");
        String name = sc.nextLine();
        System.out.print("국어 점수는?");
        int koreanScore = sc.nextInt();
        System.out.print("수학 점수는?");
        int mathScore = sc.nextInt();
        System.out.print("영어 점수는?");
        int englishScore = sc.nextInt();

//      3. 평균값 계산
        double avg = (double)(koreanScore + mathScore + englishScore)/3;

//      4. 입력 내용 출력
        System.out.println("=====================");
        System.out.println("이름: " + name);
        System.out.println("국어점수: " + koreanScore);
        System.out.println("수학점수: " + mathScore);
        System.out.println("영어점수: " + englishScore);
        System.out.println("----------------------------");
        System.out.println("평균: " + avg);
    }
}
