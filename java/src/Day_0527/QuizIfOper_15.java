package Day_0527;

import java.util.Scanner;

public class QuizIfOper_15 {
    public static void main(String[] args) {
//      1. import
        Scanner sc = new Scanner(System.in);

//      2. 변수 선언
        String thing;
        int ea;
        int price;
        int totprice;
        int dcprice;

//      3. 입력
        System.out.println("상품을 입력하시오.");
        thing = sc.nextLine();
        System.out.println("수량을 입력하시오.");
        ea = sc.nextInt();
        System.out.println("가격을 입력하시오.");
        price = sc.nextInt();

//      4. 계산
        totprice = price * ea;
        if(ea >= 5)
            dcprice = (int)(totprice - totprice * 0.1);
        else
            dcprice = price;

//      5. 출력
        System.out.println(thing + ea + "개는 총" + totprice +"원 입니다.");
        System.out.println("5개이상은 10% DC가 됩니다.");
        System.out.println("모든 할인이 적용된 금액: " + dcprice +"원 입니다.");
    }
}
