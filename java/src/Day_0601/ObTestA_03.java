package Day_0601;

public class ObTestA_03 {

    int a;
    static int b;

    public static void main(String[] args) {
//      같은 클래스 내에서는 클래스명을 생략 가능
        b = 20;
        System.out.println(b);

//      일반 인스턴스 변수는 인스턴스가 있어야 접근이 가능 -> new로 생성을 해야한다 !!
        ObTestA_03 ob1 = new ObTestA_03();
        ObTestA_03 ob2 = new ObTestA_03();

//      참조변수명으로 접근 가능
        ob1.a = 20;
        ob2.a = 50;

        System.out.println("ob1: " + ob1.a);
        System.out.println("ob2: " + ob2.a);

//      인스턴스 변수와 클래스 변수와의 호출 차이
        TestA_03 ta1 = new TestA_03();

        System.out.println("TestA_03.name" + ta1.name);
        System.out.println("TestA_03.MESSAGE" + TestA_03.MESSAGE);
        System.out.println("TestA_03.MESSAGE" + ta1.MESSAGE); // 가능은 하나 인스턴스 변수와의 혼동을 줄이기 위해 TestA_03.MESSAGE로 출력하는 것이 좋음
    }
}
