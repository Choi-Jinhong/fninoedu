package Day_0528;

import java.util.Scanner;

public class RandomNumMatch_10 {
    public static void main(String[] args) {
//      난수 맞추기 게임
        Scanner sc = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 20) + 1;
        int cnt = 1;

        System.out.println("1 ~ 20까지의 난수 발생");

        while(true){
            int myNum = sc.nextInt();
            if(myNum > randomNum)
                System.out.println(myNum + "보다 작습니다.");
            else if(myNum < randomNum)
                System.out.println(myNum + "보다 큽니다.");
            else {
                System.out.println("맞았습니다. 정답은 " + myNum + "입니다.\n시도 횟수는 " + cnt + "회 입니다.");
                break;
            }
            cnt++;
        }
    }
}