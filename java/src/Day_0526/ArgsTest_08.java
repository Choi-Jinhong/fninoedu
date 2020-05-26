package Day_0526;

public class ArgsTest_08 {
    public static void main(String[] args) {
        System.out.println("***배열의 매개변수 테스트***");
        System.out.println("첫번째 값: " + args[0]);
        System.out.println("두번째 값: " + args[1]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    }
}
