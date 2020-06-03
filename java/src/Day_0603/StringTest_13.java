package Day_0603;

public class StringTest_13 {
    public static void main(String[] args) {
//      어떤 데이터 타입이든 String 객체로 전환 가능
        int a = 1000;
        String s;
//      s = a + "";
//      s = String.valueOf(a);
        s = Integer.toString(a);
        System.out.println(s + a);

        char[] b = {'a', 'p', 'p', 'l', 'e'};
        s = String.valueOf(b);
        System.out.println(s);

        String str = "Happy day wonderful !!";
        System.out.println(str.length());

//      substring(a, b): a ~ b까지의 문자열 출력
        System.out.println(str.substring(10));

//      replace(a,b): a를 b로 전환
        System.out.println(str.replace("wonderful !!", "nice !!"));
    }
}