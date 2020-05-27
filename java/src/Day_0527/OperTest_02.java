package Day_0527;

public class OperTest_02 {
    public static void main(String[] args) {
//      * 비교 연산자 : >, <, >=, <=, !=, ==
//      * 논리 연산자: &&(and), ||(or)

        int a = 5, b = 3, c = 5;

//      결과 값을 T, F로 출력
        System.out.println(a > b); // T
        System.out.println(a == b); // F
        System.out.println(a == c); // T
        System.out.println(a != b); // T
        System.out.println(a > b && b > c); // F
        System.out.println(a > b || b > c); // T
    }
}
