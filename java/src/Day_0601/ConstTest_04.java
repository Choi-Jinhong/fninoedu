package Day_0601;

class Number{
    int num = 0;

//  생성자
//  클래스명과 이름이 같음
//  매개 변수에 따라 구분할 수 있음
    public Number(){
        num = 10;
        System.out.println("Default Constructor 호출");
    }

    public Number(int num){
        this.num = num; //인스턴스와 이름이 같을 경우 자기 자신과 구분지어주는 방법
        System.out.println("Constructor 호출");
    }

//  메소드
//  public 뒤엔 int, void, char등을 지정하여 return값을 지정할 수 있다.
    public int getNumber(){
        num = 100;
        return num;
    }
}

public class ConstTest_04 {
    public static void main(String[] args) {
//      인스턴스가 생성될 때마다 생성자 자동호출
        Number num1 = new Number();
        System.out.println(num1.num);

        Number num2 = new Number(50);
        System.out.println(num2.num);

//      디폴트 생성자를 생서아여 메소드 가져오기
        Number num3 = new Number();
        System.out.println(num3.getNumber());
    }
}
