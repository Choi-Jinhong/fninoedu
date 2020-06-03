package Day_0603;

class Outer{
    int a = 10;
    static int b = 20;

    class Inner{
        int c = 30;
        //static int d = 100; 내부에선 static 사용 불가
//      출력 메소드 내부
        public void write(){
            System.out.println("외부 변수 a= " + a);
            System.out.println("외부 정적 변수 b= " + b);
            System.out.println("내부 변수 c= " + c);
            System.out.println("내부 정적 변수는 불가능");
        }
    }
}

public class InnerClassVar {
    public static void main(String[] args){
        Outer.Inner in = new Outer().new Inner();
        in.write();
    }
}