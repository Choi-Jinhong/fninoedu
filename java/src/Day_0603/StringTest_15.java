package Day_0603;

public class StringTest_15 {
    public static void main(String[] args) {
//      StringBuffer: 문자열 저장 및 편집 기능이 추가된 자료형
        StringBuffer sb = new StringBuffer();
        sb.append("Happy");
        sb.append("nice");
        sb.append(200);
        sb.append(3.14);
        sb.append('A');

        System.out.println(sb);

//      삽입
        sb.insert(5, "Apple");

//      삭제
        sb.delete(0, 3); // 0부터 3개 삭제

//      대체
        sb.replace(6, 10, "angel"); //6 ~ 9번째 글자가 angel로 대체
        System.out.println(sb);
    }
}
