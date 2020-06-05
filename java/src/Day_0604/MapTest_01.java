package Day_0604;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Key와 Value의 값을 찾기
//조건
//1. 순서는 유지되지 않는다.
//2. key는 중복허용 X, value값은 중복허용 O
public class MapTest_01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "강호동");
        map.put("age", "22");
        map.put("addr", "서울시 구로구");

//      같은 key값으로 값을 입력할 경우, 앞에 입력되었던 값은 사라지게 된다.
        map.put("name", "수지");

        System.out.println("map의 크기: " + map.size());
        System.out.println("이름: " + map.get("name")
                            + "\n나이: " + map.get("age")
                            + "\n주소: " + map.get("addr"));

//      key값을 한번에 얻은 후 값 출력하기
        Set<String> keySet = map.keySet();

        System.out.println("방법_01");
        Iterator<String> keyiter = keySet.iterator();

        while(keyiter.hasNext()){
            String key = keyiter.next();
            System.out.println(key + ": " + map.get(key));
        }

//      Colletion에서 많이 사용하는 방법
        System.out.println("방법_02");
        for(String key: keySet)
            System.out.println(key + ": " + map.get(key));
    }
}
