package Day_0527;

import java.util.Scanner;

public class SwitchTest_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("숫자 입력: ");
        num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("숫자 1입니다.");
                break;
            case 2:
                System.out.println("숫자 2입니다.");
                break;
            case 3:
                System.out.println("숫자 3입니다.");
                break;
            case 4:
                System.out.println("숫자 4입니다.");
                break;
            default:
                System.out.println("해당하는 숫자는 없습니다.");
                break;
        }

        switch (num % 2){
            case 0:
                System.out.println(num + "--> 짝수");
                break;
            case 1:
                System.out.println(num + "--> 홀수");
                break;
        }
    }
}
