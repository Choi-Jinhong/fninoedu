package Day_0601;

public class MethodTest_11 {
    public static void hello(int age, double height){
        System.out.println("전달 순서대로 저장");
        System.out.println("제 나이는 " + age + "세");
        System.out.println("제 키는 " + height + "cm 입니다.");
    }

    public static void goodBye(){
        System.out.println("다음에 또 봅시다.!");
    }

    public static void main(String[] args) {
        System.out.println("메소드 연습 시작!!");
        hello(55, 150);
        goodBye();
    }
}
