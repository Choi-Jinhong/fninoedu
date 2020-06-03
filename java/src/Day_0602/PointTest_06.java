package Day_0602;

class superPoint{

    int x;
    int y;

    public superPoint(){
        System.out.println("슈퍼-디폴트 생성자 호출");
    }

    public superPoint(int x, int y){
        System.out.println("슈퍼-인자 생성자 호출");
        this.x = x;
        this.y = y;
    }

    public void write(){
        System.out.println("x좌표= "+ x + ", y좌표= " + y);
    }
}

class subPoint extends superPoint{

    String msg;

    public subPoint(){
        super();
        System.out.println("서브-디폴트 생성자 호출");
    }

    public subPoint(int x, int y, String msg){
        super(x, y);
        this.msg = msg;
        System.out.println("서브-인자 생서자 호출");
    }

//  오버라이딩 메소드
//  부모가 가지고 있는 메소드를 재구현 -> 미완성의 메소드를 완성
    @Override
    public void write() {
        super.write();
        System.out.println("메세지: " + msg);
    }
}

public class PointTest_06 {
    public static void main(String[] args) {
        subPoint sp = new subPoint(1, 2, "체크");
        sp.write();
    }
}
