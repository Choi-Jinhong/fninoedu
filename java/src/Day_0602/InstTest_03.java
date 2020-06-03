package Day_0602;

public class InstTest_03 {
    private InstTest_03(){
        System.out.println("디폴트 생성자");
    }

    public static InstTest_03 getInstance(){
        return new InstTest_03();
    }

    public void writeMessage(){
        System.out.println("안녕하세요.");
    }
}
