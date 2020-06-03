package Day_0603;

import java.util.Scanner;

class UserException extends Exception{
    public UserException(String msg){
        super(msg);
    }
}

public class ThrowsException_12 {

    public static void nameInput() throws Exception{
        Scanner sc = new Scanner(System.in);

        String[] str = {"김태희", "고소용", "이민", "김혜자"};
        String name = "";

        System.out.println("이름을 입력하시오.");
        name = sc.nextLine();

        for(String n: str){
            if(n.equals(name)){
                throw new UserException("금지된 단어 입니다.");
            }
        }
    }

    public static void main(String[] args) {

    }
}
