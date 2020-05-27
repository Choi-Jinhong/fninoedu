package Day_0527;

import java.util.Scanner;

public class MaxNum_11 {
    public static void main(String[] args) {
//      3개의 숫자를 입력해서 가장 큰 수를 구하는 최대값을 출력

        Scanner sc = new Scanner(System.in);
        int x, y, z, max;
        System.out.println("3개의 수를 입력하시오.");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        System.out.println("-------------------------------");
        System.out.println("3개의 숫자:" + x + ", " + y + ", " + z);
        if(x > y && x > z)
            max = x;
        else if(y > z)
            max = y;
        else
            max = z;

        System.out.println(max);
    }
}
