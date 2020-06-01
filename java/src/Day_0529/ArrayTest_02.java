package Day_0529;

public class ArrayTest_02 {
    public static void main(String[] args) {
        String[] str;
        str = new String[4];

        str[0] = "홍길동";
        str[1] = "나나";
        str[2] = "이승기";
        str[3] = "강호동";

//      출력
//      for문
        for(int i = 0; i < str.length; i++)
            System.out.println(str[i]);

//      foreach문
        for(String a:str)
            System.out.println(a);
    }
}
