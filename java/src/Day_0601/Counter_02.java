package Day_0601;

public class Counter_02 {

//  인스턴스 변수
//  서로 다른 메모리를 가진다.
//  인스턴스에 공통적으로 사용하는 것에 static을 붙인다.
    static int count = 0;


//  생성자
    public Counter_02(){ //
        count++;
        System.out.println();
    }

    public static void main(String[] args) {
        Counter_02 c1 = new Counter_02(); // 1출력
        Counter_02 c2 = new Counter_02(); // 2출력(staitc이 아닐 경우 1출력)
    }
}
