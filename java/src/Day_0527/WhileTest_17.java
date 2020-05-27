package Day_0527;

public class WhileTest_17 {
    public static void main(String[] args) {
        int i = 1;

        while(i<10)
        {
            System.out.println("Java" + i);
//          증감식
            i++;
//          break문 필수 --> 조건문
        }

        System.out.println("종료");

        int c = 1;
        while(c < 6){
            System.out.println("커피" + c + "잔");
            c++;
        }
        System.out.println("종료");
    }
}
