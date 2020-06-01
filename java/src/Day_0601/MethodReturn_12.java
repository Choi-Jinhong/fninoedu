package Day_0601;

public class MethodReturn_12 {
    public static void main(String[] args) {
        System.out.println("10과 20의 합: " + add(10, 20));
        System.out.println("한 변의 길이가 4.5인 정사각형의 넓이: " + square(4.5));
    }
    public static int add(int num1, int num2){
//      return값은 최대한 간결하게 표현하는 것이 좋다.
        int result = num1 + num2;
        return result;
    }

    public static  double square(double num){
        return num * num;
    }
}
