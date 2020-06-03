package Day_0602;

public class InterABImp_08 implements InterA_08, InterB_08{
    @Override
    public void draw() {
        System.out.println("그림을 그린다.");
    }

    @Override
    public void play() {
        System.out.println("축구를 한다.");
    }

    @Override
    public void write() {
        System.out.println("글을 쓴다.");
    }
}
