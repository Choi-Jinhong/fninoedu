package Day_0602;

import java.util.Scanner;

interface Command{
    public void write();
}

class Insert implements Command{
    @Override
    public void write() {
        System.out.println("게시판에 게시글을 추가합니다.");
    }
}

class Modify implements Command{
    @Override
    public void write() {
        System.out.println("게시판에 게시글을 수정합니다.");
    }
}

class Delete implements Command{
    @Override
    public void write() {
        System.out.println("게시판에 게시글을 삭제합니다.");
    }
}

class List implements Command{
    @Override
    public void write() {
        System.out.println("게시판에 게시글을 조회합니다.");
    }
}

public class InterBoardEx_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Command comm = null;
        boolean bool = true;

        while(bool){
            System.out.println("사용할 기능을 선택하세요.: ");
            System.out.println("1. 추가 2. 수정 3. 삭제 4. 조회 5. 종료");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    comm = new Insert();
                    comm.write();
                    break;
                case 2:
                    comm = new Modify();
                    comm.write();
                    break;
                case 3:
                    comm = new Delete();
                    comm.write();
                    break;
                case 4:
                    comm = new List();
                    comm.write();
                    break;
                default:
                    System.out.println("종료합니다.");
                    bool = false;
                    break;
            }
        }
    }
}
