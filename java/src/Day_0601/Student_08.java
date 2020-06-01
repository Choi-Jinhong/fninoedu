package Day_0601;

public class Student_08 {
//  인스턴스가 private면 메인에서 생성을 해도 참조변수로 접근이 불가능
//  접근 가능 방법 -> 메소드를 사용
//  set()은 값을 수정, get()은 값을 반환
    private String name;
    private int age;

//  set Method
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

//  get Method
//  get은 수정된 값을 되돌려주는 메소드 -> 조회목적
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
