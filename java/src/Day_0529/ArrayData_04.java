package Day_0529;

import java.util.Scanner;

public class ArrayData_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] data = new int[5];
        int sum = 0;

        for(int i = 0; i < data.length; i++) {
            System.out.print((i + 1) + "번째 값: ");
            data[i] = sc.nextInt();
            sum += data[i];
        }
        System.out.println("-------------------------");
        for(int i = 0; i < data.length; i++)
            System.out.println(i + " => " + data[i]);
        System.out.println("-------------------------");
        System.out.println("총 합계: " + sum);
    }
}
