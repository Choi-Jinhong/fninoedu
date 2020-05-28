package Day_0528;

public class ContinueTest_02 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while(true){
            i++;
            if(i % 2 == 1) // 홀수 조건문
                continue;
            sum += i;
            if(i == 100)
                break;
        }

        System.out.println("1 ~ " + i + "까지의 합은 " + sum);
    }
}
