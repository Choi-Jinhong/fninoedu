package Day_0526;

public class DataType_04 {
    public static void main(String[] args) {
/*------8가지 자료형 살펴보기------*/
//      1. Boolean
        Boolean flag = false; // true와 false의 두가지 값만 입력 가능
//      2. 문자형
        char a = 'A'; // 한글이랑 영문자 스펠링 하나도 가능, 기본적으로 정수형 !! -> 아스키 코드로 변경 가능, ''를 이용하여 값을 입력
//      3. 정수형
        byte b = -128;
        short s = 32000; // 8bits
        int c = 50000; // 32bits
        long num = 8700000; // 64bits
//      4. 실수형
        double d = 43.2;
        float f = 758.5f; //float와 double을 구분하기 위해 float 값 뒤에는 f를 붙여야 함

//      자료형 출력
        System.out.println(flag);
        System.out.println(a);
        System.out.println(a + 2); // char + int = int
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(num);
        System.out.println(d);
        System.out.println(f);
//      Casting -> (바꾸고자하는 자료형)값
        System.out.println((char)(a + 2));
    }
}
