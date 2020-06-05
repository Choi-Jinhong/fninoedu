package Day_0604;

import java.util.ArrayList;

public class ArrayListTest_02 {
    public static void main(String[] args) {

        String[] str = {"장미", "프리지아", "백합", "수국", "튤립", "프리지아"};

//      ArrayList
//      : 객체를 삽입, 삭제, 검색을 할 수 있는 Container class
        ArrayList<String> list = new ArrayList<String>();

//      데이터 저장
        for(String s: str){
            list.add(s);
        }
//      list 크기
        System.out.println(list.size());

        System.out.println("출력_01");
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        System.out.println("출력_02");
        for(String s: list)
            System.out.println(s);
    }
}
