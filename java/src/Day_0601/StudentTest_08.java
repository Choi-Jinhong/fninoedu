package Day_0601;

public class StudentTest_08 {
    public static void main(String[] args) {
        Student_08 st1 = new Student_08();
        Student_08 st2 = new Student_08();

//      set Method로 private 값을 수정하기
        st1.setName("최진홍");
        st1.setAge(26);

//      get Method로 수정한 값 얻기
        String name = st1.getName();
        int age = st1.getAge();
        System.out.println(name + ", " + age); // System.out.println(st1.getName() + ", " + st1.getAge());

//      set Method로 private 값을 수정하기
        st2.setName("유재석");
        st2.setAge(42);

//      get Method로 수정한 값 얻기
        System.out.println(st2.getName() + ", " + st2.getAge());
    }
}
