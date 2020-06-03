package Day_0603;

import java.util.Scanner;
class outerObj{
    class InnerClass{
        public void write(){
            System.out.println("내부 클래스의 메소드");
        }
    }
}
public class InnerClassTest_02 {
    public static void main(String args[]){
        //외부(일반적)
        outerObj outobj = new outerObj();
    }
}