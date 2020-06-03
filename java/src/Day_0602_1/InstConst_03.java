package Day_0602_1;

import Day_0602.InstTest_03;

public class InstConst_03 {
    public static void main(String[] args) {

//      InstTest_03 t1 = new InstTest_03(); // private라 다른 패키지에서 생성 불가
        InstTest_03 t1 = InstTest_03.getInstance();
        t1.writeMessage();
    }
}
