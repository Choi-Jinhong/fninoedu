package Day_0603;

import java.io.IOException;
import java.io.InputStream;

public class ExceptionTest_10 {
    public static void main(String[] args){

//      InputStream: 바이트 단위 입력, 최상위 클래스가 추상클래스이므로 객체를 직접 만들 수 없음
//                     -> 자식 클래스가 받아서 직접 구현
//      read(): 한 바이트만 읽음
//      read(byte[] b): 사용자가 지정한 바이트를 이용해서 한 번에 원하는 만큼 읽을 수 있다.

        InputStream is = System.in;
        int a = 0;

        System.out.print("한 글자 입력: ");
        try {
            a = is.read();
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("3초 뒤에 출력합니다.");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e ){
            e.printStackTrace();
        }
        System.out.println("입력 값: " + (char)a);
    }
}
