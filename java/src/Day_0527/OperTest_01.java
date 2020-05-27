package Day_0527;

public class OperTest_01 {
    public static void main(String[] args) {
//      1. 증감 연산자
        int a, b;
        a = b = 5;

        ++a; // 기존 값에다 1을 증가
        b++; // b = b + 1

        System.out.println("a= " + a + ", b= " + b);
//      1-1. 수식에서 전치, 후치를 사용할 때 결과값이 틀림
        int m, n;
        m = n = 0;
        a = b = 5;

        m = a++; // 후치일 경우는 대입 후 증가
        System.out.println("m= " + m + ", a= " + a);

        n = ++b; // 전치일 경우는 증가 후 대입
        System.out.println("n= " + n + ", b=" + b);

    }
}
