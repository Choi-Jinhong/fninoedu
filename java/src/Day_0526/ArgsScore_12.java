package Day_0526;

public class ArgsScore_12 {
    public static void main(String[] args) {
//      1. 변수 선언
        String name = "최진홍";
        int javaScore = 88;
        int jspScore = 99;
        int springScore = 77;

//      2. 계산
        int total = javaScore + jspScore + springScore;
        double avg = (double)total / 3;

//      3. 출력
        System.out.println("***중간고사 점수***");
        System.out.println("==========================");
        System.out.println("이름: " + name + "님");
        System.out.println("JAVA: " + javaScore + "점");
        System.out.println("JSP: " + jspScore + "점");
        System.out.println("SPRING: " + springScore + "점");
        System.out.println("---------------------------");
        System.out.println("총점: " + total + "점");
        System.out.println("평균: " + avg + "점");
    }
}
