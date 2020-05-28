package Day_0528;

public class RandomTest_09 {
    public static void main(String[] args) {
//      0 ~ 0.999999999999999....까지의 난수
        for(int i = 1; i <= 10; i++){
            double n = Math.random();
            System.out.println(n);
        }
        System.out.println("-------------------------------");
//       0 ~ 9까지의 난수
        for(int i = 1; i <= 10; i++){
            int n = (int)(Math.random() * 10);
            System.out.println(n);
        }
        System.out.println("-------------------------------");
//      0 ~ 99까지의 난수
        for(int i = 1; i <= 10; i++){
            int n = (int)(Math.random() * 100);
            System.out.println(n);
        }
        System.out.println("-------------------------------");
//      1 ~ 10까지의 난수
        for(int i = 1; i <= 10; i++){
            int n = (int)(Math.random() * 10 + 1);
            System.out.println(n);
        }
        System.out.println("-------------------------------");
//      1 ~ 45까지의 난수
        for(int i = 1; i <= 10; i++){
            int n = (int)(Math.random() * 45 + 1);
            System.out.println(n);
        }
        System.out.println("-------------------------------");
//      65 ~ 90까지의 난수
        for(int i = 1; i <= 10; i++){
            int n = (int)(Math.random() * 26 + 65);
            System.out.println(n);
        }
    }
}
