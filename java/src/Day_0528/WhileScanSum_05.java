package Day_0528;

import java.util.Scanner;

public class WhileScanSum_05 {
    public static void main(String[] args) {
//      입력 갯수, 입력한 수의 합, 입력한 수의 평균
        Scanner sc = new Scanner(System.in);

        int cnt = 0, sum = 0, n;
        double avg = 0.0;
        while(true){
            System.out.println("숫자 입력: ");
            n = sc.nextInt();
            if(n == 0)
                break;
            else {
                cnt++;
                sum += n;
                avg = (double)sum / cnt;
            }
        }
        System.out.println("총 입력 갯수: " + cnt);
        System.out.println("입력한 수의 합: " + sum);
        System.out.println("입력한 수의 평균: " + avg);
    }
}
