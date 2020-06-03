package Day_0602;

abstract public class Fruit_07 { // abstract 메소드가 존재할 때 선언 방식
    public static final String MESSAGE = "오늘은 좋은 날";

//  일반 메소드
//  public _변수_타입_ _변수명__(){
//
//  }
    public void showTitle(){
        System.out.println("우리는 추상 클래스를 공부합니다.");
    }

//  추상메소드
//  abstract public __변수타입__ __변수명__();
//  {} 부분이 없음
    abstract public void showMessage();

}
