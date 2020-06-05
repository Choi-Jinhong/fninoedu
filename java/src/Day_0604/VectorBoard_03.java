package Day_0604;

import java.util.Scanner;
import java.util.Vector;

public class VectorBoard_03 {
//  클래스 형태의 데이터 저장하는 Vector
    Vector<BoardDTO_03> list = new Vector<BoardDTO_03>();

//  1. 입력을 선택할 경우에 해당하는 메소드를 생성
    public void setBoard(){
        Scanner sc = new Scanner(System.in);
        String name, subject, content;
        System.out.print("작성자명 입력: ");
        name = sc.nextLine();
        System.out.print("게시글 제목 입력: ");
        subject = sc.nextLine();
        System.out.print("내용 입력: ");
        content = sc.nextLine();

//      생성
        BoardDTO_03 DTO = new BoardDTO_03(name, subject, content);

//     Vetor에 입력
        list.add(DTO);

        System.out.println("현재 입력된 DTO : " + list.size() + "개");
    }

//  2. 출력을 선택할 경우에 해당하는 메소드 생성
    public void getBoard(){
        System.out.println("[게시판]");
        System.out.println("No.\t\t제목\t\t내용\t\t작성자");
        System.out.println("----------------------------------------");
        for(int i = 0; i < list.size(); i++) {
            BoardDTO_03 b = list.get(i);
            System.out.println((i+1) + "\t\t" + b.getName() + "\t\t" + b.getSubject() + "\t\t" + b.getContent());
        }
    }

    public static void main(String[] args) {
        VectorBoard_03 vb = new VectorBoard_03();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Boolean b = true;

        while(b){
            System.out.println("<<이용하실 기능을 선택해주세요>>");
            System.out.println("1. 데이터 입력 2. DTO 출력(종료를 원할 시 0을 입력)");
            choice = sc.nextInt();
            if(choice == 0)
                b = false;
            else if(choice == 1)
                vb.setBoard();
            else if(choice == 2)
                vb.getBoard();
            else
                System.out.println("기능을 다시 선택해주세요.");
        }
    }
}
