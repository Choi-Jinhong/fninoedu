package Day_0601;


class Member{
    String name = "최진홍";
    public Member(){
        System.out.println("내이름은 " + name + "입니다.");
    }

    public Member(String name){
        this.name = name; // Member(name)의 변수에 this를 입력!!
        System.out.println("내이름은 " + name + "입니다.");
    }
}

public class ConstTest_05 {
    public static void main(String[] args) {
//      생성자 호출
        Member mem1 = new Member();
        Member mem2 = new Member("김개똥");
        Member mem3 = new Member("최머시기");
        Member mem4 = new Member("이멍게");
    }
}
