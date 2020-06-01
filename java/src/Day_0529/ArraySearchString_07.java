package Day_0529;

import java.util.Scanner;

public class ArraySearchString_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag;
        String s = "start";
        String[] data = {"김", "이", "박", "최", "서", "강", "노", "고", "권", "경"};


        while(!s.equalsIgnoreCase("q")){
            System.out.println("이름을 입력해주세요.(종료: q, Q)");
            s = sc.nextLine();
            flag = false;
            for(int i = 0; i < data.length; i++){
                if(s.equals(data[i])){
                    flag = true;
                    System.out.println(i+1 + "번째에서 검색");
                }
            }
            if(!flag)
                System.out.println("해당 성씨를 찾을 수 없습니다.");
        }
    }
}