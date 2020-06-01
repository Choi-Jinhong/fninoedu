package Day_0601;

public class MethodTest_10 {
    public static void main(String[] args) {
//      main 메소드에서 시작해서 블록 괄호안의 내용을 순차적으로 실행
//      메소드로 만들어 main에서는 호출만 간결히 하는 게 좋은 예
        System.out.println("프로그램 시작!!");
        goodMorning(26);
        goodMorning(55);
        System.out.println("프로그램 종료 ~~");
    }

    public static void goodMorning(int age){
        System.out.println("좋은 아침입니다.");
        System.out.println("제 나이는 " + age + "세 입니다.");
    }
}
