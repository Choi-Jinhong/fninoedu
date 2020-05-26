package Day_0526;

public class PrintfTest_07 {
    public static void main(String[] args) {
//      printf: %d -> 정수, %s -> 문자
        int num1 = 50, num2 = 30; // 동일한 자료형일 경우에는 한 줄에 작성 가능
        int result = num1 + num2;

        System.out.printf("num1은 %d이고, num2는 %d이고, 그의 합은 %d입니다.", num1, num2, result);
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("*****println으로 출력********");
        System.out.println("num1은 " + num1 + "이고, num2는 " + num2 + "이고, 그의 합은 " + result +"입니다.");
    }
}
