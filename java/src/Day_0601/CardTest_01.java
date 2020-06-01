package Day_0601;

class Card{ // class 옆에 public으로 하게 될 경우 오류가 발생 -> default로 생성
//  public으로 만들 경우 보안에 취약 할 수 있음 -> 변수를 private로 생성 !!

//  0. 멤버 변수
//     -> 인스턴스 변수, 클래스 변수

//  1. 인스턴스 변수
//     -> new로 생성하지 않을 경우 접근할 수 없음
//     -> 각 인스턴스의 개별적인 저장 공간이 존재
//     -> 각각 다른 값을 저장할 수 있음
//     -> 접근하는 방법: 참조변수명.________;
    String kind; //카드 무늬
    int num; // 카드의 숫자(a ~ k)

//  2. 클래스 변수(보통 Static 변수)
//     -> static으로 선언했을 경우를 클래스 변수라고 함
//     -> new로 생성하지 않아도 접근할 수 있음
//     -> 모든 인스턴스들이 공유, 클래스가 로딩될 때 생성, 종료될 때 소멸
//     -> 접근하는 방법: 클래스명.__________;
    static int width;
    static int height; //카드의 너비와 높이

}

public class CardTest_01 {
    public static void main(String[] args) {
//      클래스 변수 생성
//      클래스가 로딩될 때 클래스명 바로 로딩
        System.out.println(Card.width);
        System.out.println(Card.height);
//      메소드는 초기값을 지정해주지 않으면 오류가 발생
//      클래스에서는 초기값을 지정해주지 않으면 int는 0, string은 null, boolean은 false로 초기화된다.

        Card.width = 50;
        Card.height = 80;

        System.out.println(Card.width);
        System.out.println(Card.height);

//      인스턴스 변수 생성
        Card c1 = new Card();
        System.out.println(c1.kind);
        System.out.println(c1.num);
//      메소드는 초기값을 지정해주지 않으면 오류가 발생
//      클래스에서는 초기값을 지정해주지 않으면 int는 0, string은 null, boolean은 false로 초기화된다.
        c1.kind = "heart";
        c1.num = 7;

        Card c2 = new Card();
        c2.kind = "spade";
        c2.num = 10;

        System.out.println(c1.kind + " " + c1.num + ", " + Card.width + " " + Card.height);
        System.out.println(c2.kind + " " + c2.num + ", " + Card.width + " " + Card.height);
    }
}
