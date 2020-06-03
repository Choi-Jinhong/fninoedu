package Day_0603;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//순서를 유지하지 않는 데이터, 중복 허용 없음
public class HashSetTest_16 {
    public static void main(String[] args) {
//      자바의 정석 p.672
//      (인터페이스 or 클래스명)<데이터 형> 객체이름 = new 클래스명<데이터 형>;
        Set<String>set = new HashSet<String>();

        set.add("사과");
        set.add("바나나");
        set.add("키위");
        set.add("바나나");
        set.add("오렌지");
        set.add("사과");

        System.out.println("데이터 갯수: " + set.size());
        System.out.println("출력");

        Iterator<String> iter = set.iterator(); // set은 컬렉션명
        while(iter.hasNext()){ // 더이상 데이터가 없으면 false값 반환
            String s = iter.next(); // 데이터 반환 후 다음값으로 이동
            System.out.println(s);
        }

        set.clear(); // 모든 데이터 삭제

        if(set.isEmpty())
            System.out.println("set 내에 데이터가 없음");
        else
            System.out.println("set 내에 데이터가 있음");
    }
}
