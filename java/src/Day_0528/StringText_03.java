package Day_0528;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringText_03 {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

//  김씨성을 가진 사람 수 찾기
    public static void test1(){
        Scanner sc = new Scanner(System.in);
        String name;
        int cnt = 0;

        while(true){
            System.out.println("이름 입력(종료: 끝)");
            name = sc.nextLine();
            if(name.startsWith("김")) // ______.stratswith(): 특정 문자열의 첫글자를 ()의 글자와 비교
                cnt++;
            //break;
            if(name.equals("끝"))
                break;
        }
        System.out.println("김씨 성을 가진 사람은 총 " + cnt + "명 입니다.");
    }

//  주민등록번호로 남자/여자 구분하기
    public static void test2(){
        String jumin = "950508-1010009";
        String gender;
        if(jumin.charAt(7) == 1 || jumin.charAt(7) == 3) //  _______.charAt(index): index에 맞는 한 글자만 추출
            gender = "남자";
        else if(jumin.charAt(7) == 2 || jumin.charAt(7) == 4)
            gender = "여자";
        else
            gender = "오류";
        System.out.println(gender);
    }

//
    public static void test3(){
        String str = "나는 fn이노에듀에서 혁신성장을 배우는 중입니다.";

        String word1 = str.substring(3); // _____.substring(index): index부터 끝까지 글자를 반환
        String word2 = str.substring(3, 9); //_____.substring(index1, index2): index1 ~ index2 - 1까지 글자를 반환
        System.out.println(word1);
        System.out.println(word2);

//      혁신성장만 추출
        String word3 = str.substring(12, 16);
        System.out.println(word3);
    }
}
