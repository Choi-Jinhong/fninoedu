package Day_0602;

public class InterEX_08 {
    public static void main(String[] args) {

//      부모 클래스로 생성(서브)
        InterABImp_08 inter1 = new InterABImp_08();
        inter1.write();
        inter1.draw();
        inter1.play();

//      다형성으로 생성 후 출력
        InterA_08 inter2 = new InterABImp_08();
        inter2.draw();
        inter2.play();

        InterB_08 inter3 = new InterABImp_08();
        inter3.write();
    }
}
