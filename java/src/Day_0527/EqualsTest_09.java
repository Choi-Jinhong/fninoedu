package Day_0527;

import java.util.Scanner;

public class EqualsTest_09 {
    public static void main(String[] args) {
//      문자열의 비교는 관계연산자 X
//      "equals"는 메소드를 이용해서 비교
//      "equalsIgnoreCases"는 대소문자 관계없이 비교

        Scanner sc = new Scanner(System.in);

        String msg;

        System.out.println("영어단어를 입력하세요.: Ex) happy, rose, angel");
        msg = sc.nextLine();

        if(msg.equals("angel")) // 문자열이 같으면 true
            System.out.println("*** angel ***");
        else if(msg.equals("happy"))
            System.out.println("*** happy ***");
        else if(msg.equals("rose"))
            System.out.println("*** rose ***");
        else
            System.out.println("일치하는 단어가 없습니다.");

    }
}
