package Day_0526;

public class CastNum_05 {
    public static void main(String[] args) {
        byte a = 127;
        byte b = (byte)128;

        System.out.println(a);
        System.out.println(b); // 값의 손실이 일어나는 경우를 "Demotion"이라고 함

        char c = 'A';
        int d = (int)c;

        System.out.println(c);
        System.out.println(d);

        double e = 10.5;
        int f = (int)e;

        System.out.println(e);
        System.out.println(f);

    }
}