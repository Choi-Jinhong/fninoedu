package Day_0528;

public class ForSumTest_01 {
    public static void main(String[] args) {
        sumTest1();
        sumTest2();
        sumTest3();
        sumTest4();
    }

    public static void sumTest1(){
//      for문으로 반복문 내의 num값을 sum에 더하는 문제
        int sum = 0;
        for (int i = 1; i <= 5; i++)
            sum += i;
        System.out.println(sum);
    }

    public static void sumTest2(){
//      1 ~ 10까지 홀수의 합
        int sum = 0;
        for(int i = 1; i <= 10; i += 2){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void sumTest3(){
//      지역변수를 사용하기 위해 i를 미리 선언
        int sum = 0, i;
        for(i = 1; i <= 10; i++)
            sum += i;
        System.out.println((i-1) + "까지의 합은 " + sum);
    }

    public static void sumTest4(){
//      while을 이용하여 1 ~ 100까지의 합 구하기
        int i = 0;
        int sum = 0;
        while(true) {
            i++;
            sum += i;
            if (i == 100)
                break;
        }
        System.out.println("1 ~ " + i + "까지의 합은 " + sum + "입니다.");
    }
}
