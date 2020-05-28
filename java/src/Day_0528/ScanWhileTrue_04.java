package Day_0528;

import java.util.Scanner;

public class ScanWhileTrue_04 {
    public static void main(String[] args) {
//      여러분이 입력한 숫자값의 합을 구하시오.
        Scanner sc = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하시오.");
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 1;

        while(true){
            sum += cnt;
            if(n == cnt)
                break;
            cnt++;
        }

        System.out.println("------------------------------------");
        System.out.println("1 ~ " + n + " 까지의 합은 " + sum + "입니다.");
    }
}
