package Day_0528;

public class QuizForWhile_11 {
    public static void main(String[] args) {
        System.out.println("--------for01()-------");
        for01();
        System.out.println("--------for02()-------");
        for02();
        System.out.println("-------while01()-------");
        while01();
        System.out.println("-------while02()-------");
        while02();
    }

//  continue 문 써서 1 ~ 10까지의 홀수 값 찾기
    public static void for01(){
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 1)
                System.out.println("홀수값:" + i);
            else
                continue;
        }
    }

//  for문을 이용한 1 ~ 10까지의 홀수 합 구하기(자유롭게)
    public static void for02(){
        int sum = 0;
        for(int i = 1; i <= 10; i = i + 2)
            sum += i;
        System.out.println("총 합계: " + sum);
    }

//  while(true)를 사용하여 1 ~ 100까지 짝수의 합 구하기
    public static void while01(){
        int num = 1;
        int sum = 0;

        while(true){
            if(num % 2 == 0)
                sum += num;
            if(num == 100)
                break;
            num++;
        }
        System.out.println("1 ~ " + num + "사이의 짝수의 합: " + sum);
    }

//  1 ~ 100까지의 3의 배수 구하기(자유롭게)
    public static void while02(){
        int cnt = 0;
        int num = 1;
        while(num <= 100){
            if(num % 3 == 0)
                cnt++;
            num++;
        }
        System.out.println("3의 배수 개수는 " + cnt + "개 입니다.");
    }
}
