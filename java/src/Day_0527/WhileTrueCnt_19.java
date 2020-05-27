package Day_0527;

public class WhileTrueCnt_19 {
    public static void main(String[] args) {
//      1 ~ 100까지의 숫자 중에서 3의 배수는 몇 개가 있는 지 구하시오.
        int cnt = 0;
        int num = 1;

        while(num <= 100){
            if(num % 3 == 0)
                cnt++;
            num++;
        }
        System.out.println(cnt);
    }
}
