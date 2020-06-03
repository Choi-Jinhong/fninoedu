package Day_0602;

import Day_0602_1.SuperObj_04;

class SubObj_04 extends SuperObj_04 {

    private String addr;

    public SubObj_04(){  // -> ERROR 발생 -> 부모 클래스에 Default 생성자를 만들어 놓으면 됌
        super(); // -> Default 생성자에는 super()가 생략되어있기 때문에 생성하지 않아도 된다.
    }

    public SubObj_04(String name, int age, String addr) {
        super(name, age);
        this.addr = addr;
    }

    public void writeData(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + addr);
    }

}

public class TestObj_04 {
    public static void main(String[] args) {
        SubObj_04 sub = new SubObj_04("최진홍", 26, "서울시 중랑구");

        sub.writeData();
    }
}
