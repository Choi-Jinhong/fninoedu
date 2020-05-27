package Day_0527;

public class ForTotal_20 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 10; i++){
            if(i % 3 == 0)
                sum += i;
        }

        System.out.println(sum);
    }
}
