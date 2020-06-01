package Day_0601;

class Person{
//  인스턴스 변수
    String name;
    int age;

//  디폴트 생성자
    public Person(){
//      this로 다른 생성자를 호출 가능
        this("최진홍", 35); //Person(name, age)를 호출
    }
    public Person(String name){
        this(name, 25);
    }
    public Person(String name, int age){
        this.name = name; // 인스턴스의 변수를 name으로 초기화
        this.age = age;

        System.out.println("호출");
    }

//  메소드(출력문)
    public void write(){
        System.out.println("이름: " + name + "\t나이: " + age);
    }
}

public class ConstThis_07 {
    public static void main(String[] args) {
//      디폴트 생성자 호출
        Person p1 = new Person();
        p1.write();

//      name 생성자 호출
        Person p2 = new Person("홍길동");
        p2.write();

//      name, age 생성자 호출
        Person p3 = new Person("김개똥", 20);
        p3.write();

        System.out.println(p3.name);
    }
}
