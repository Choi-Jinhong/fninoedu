package Day_0603;

public class ExceptionTest_08 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        try {
//          예외가 발생할 수 있는 코드를 삽입
            int num = 3 / 0; //일부로 에러 발생
        }catch (Exception e){
            System.out.println("Error");
        }
        System.out.println("프로그램 종료");
    }
}