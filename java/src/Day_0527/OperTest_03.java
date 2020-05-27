package Day_0527;

public class OperTest_03 {
    public static void main(String[] args) {
//      * 대입 연산자
//        : +=, -=, *=, /= , %=

        int a, b, c, d, e;
        a = b = c = d = e = 10;

        a += 2; // a = a + 2;
        System.out.println("a= " + a); // 12

        b-= 3; // b = b - 3;
        System.out.println("b= " + b); // 7

        c *= 3; // c = c * 3;
        System.out.println("c= " + c); // 30

        d /= 3; // d = d / 3;
        System.out.println("d= " + d); // 3

        e %= 3; // e = e % 3;
        System.out.println("e= " + e); // 1
    }
}
