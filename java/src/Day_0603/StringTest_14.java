package Day_0603;

import java.util.Scanner;

public class StringTest_14 {
    public static void main(String[] args) {
        String[] names = {"김동완", "추미애", "이익준", "채송화", "최진홍", "김선미", "윤희랑"};

        Scanner sc = new Scanner(System.in);
        String name = "";
        int cnt = 0;

        while(true){
            System.out.print("검색할 이름을 입력(일부만 가능): ");
            name = sc.nextLine();
            if(name.equalsIgnoreCase("q")){
                System.out.println("종료합니다.");
                break;
            }

            for(String s:names){
                if(s.startsWith(name)) {
                    cnt++;
                    System.out.println(s);
                }
            }
        }
        System.out.println("총 " + cnt + "명이 있습니다.");
    }
}
