package Day_0603;

interface Annoy{
    public void write();
    public void play();
}

class InterEx{
    Annoy ina = new Annoy() {
        @Override
        public void write() {
            System.out.println("일기쓰기");
        }

        @Override
        public void play() {
            System.out.println("게임하기");
        }
    };
}

public class Anonymous_06 {
    public static void main(String[] args) {

//      익명 내부 클래스에서 완성된 추상메소드 불러오기
        InterEx ex = new InterEx();
        ex.ina.play();
        ex.ina.write();
    }
}
