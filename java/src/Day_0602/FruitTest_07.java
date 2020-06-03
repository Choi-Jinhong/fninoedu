package Day_0602;

public class FruitTest_07 {
    public static void main(String[] args) {
//      자식 클래스로 생성
/*
        Apple_07 apple = new Apple_07();
        apple.showMessage();
        apple.showTitle();

        Banana_07 banana = new Banana_07();
        banana.showMessage();

        Orange_07 orange = new Orange_07();
        orange.showMessage();
 */
        Fruit_07 fr1;
        fr1 = new Apple_07();
        fr1.showTitle();
        fr1.showMessage();
        fr1 = new Orange_07();
        fr1.showMessage();
        fr1 = new Banana_07();
        fr1.showMessage();
    }
}
