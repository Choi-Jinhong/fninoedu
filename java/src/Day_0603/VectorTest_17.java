package Day_0603;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest_17 {
    public static void main(String[] args) {
//      가변적인 배열을 사용하기 위해선 List를 사용하는 것이 좋다.
//      List interface -> Vector class
//      Q. 그럼 처음부터 Vector 사용하면 되지 않나요??
//      A.
//      List<String> list = new Vector<>();
        Vector<String> list= new Vector<>(); // 컬렉션 선언
        System.out.println("초기 할당 크기: " + list.capacity());
        System.out.println("초기 데이터 갯수: " + list.size());

//      데이터 추가
//      다른 데이터형 추가 시 오류가 발생
        list.add("사과");
        list.add("배");
        list.add("바나나");
        list.add("오렌지");
        list.add("키위");
        list.add("수박");

        System.out.println("추가 후 데이터 갯수: " + list.size());

        System.out.println("1st_출력");
        for(int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("2nd_출력");
        for(String s: list)
            System.out.println(s);

        System.out.println("3rd_출력");
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
