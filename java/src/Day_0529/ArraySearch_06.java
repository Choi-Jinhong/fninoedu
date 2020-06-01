package Day_0529;

import java.util.Scanner;

public class ArraySearch_06 {
    public static void main(String[] args) {
        int[] data = {5, 45, 77, 88, 62, 23, 99, 55, 32};

        Scanner sc = new Scanner(System.in);
        boolean flag;
        int num;

        while(true){
            System.out.println("검색할 숫자를 입력하시오.");
            num = sc.nextInt();
            flag = false;
            for(int i = 0; i < data.length; i++){
                if(num == data[i]) {
                    flag = true;
                    System.out.println(i + 1 + "번째에서 검색");
                }
            }

            if(!flag)
                System.out.println("값을 찾을 수 없습니다.");

            if(num == 0)
                break;
        }
    }
}
