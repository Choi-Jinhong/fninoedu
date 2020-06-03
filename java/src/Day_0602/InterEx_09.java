package Day_0602;

interface InterC{
    public void draw();
    public void play();
}

interface  InterD extends InterC{
    public void write();
}

class IfImplement implements InterD{

    @Override
    public void draw() {
        System.out.println("그림 그리기");
    }

    @Override
    public void play() {
        System.out.println("게임하기");
    }

    @Override
    public void write() {
        System.out.println("쓰기");
    }
}

public class InterEx_09 {
    public static void main(String[] args) {
        IfImplement inter = new IfImplement();

        inter.draw();
        inter.play();
        inter.write();
    }
}
