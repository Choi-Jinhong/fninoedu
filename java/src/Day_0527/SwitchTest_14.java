package Day_0527;

import java.util.Scanner;

public class SwitchTest_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;

        System.out.println("메뉴를 고르시오.");
        menu = sc.nextLine();

        switch (menu){
            case "피자":
            case "파스타":
                System.out.println(menu + "는 현재 있습니다.");
                break;
            default:
                System.out.println("선택하신 " + menu +"는 없습니다.");
        }
    }
}
