package Day_0602;

class Info{
    private String name;
    private String blood;
    private int age;
    static int count;

    public Info(String n, String b, int a){
        name = n;
        blood = b;
        age = a;
        count++;
    }

    public void write(){
        System.out.println(name + "\t\t" + blood + "\t\t" + age + "세");
    }
}

public class QuizArrayConstTest_11 {
    public static void main(String[] args) {
        /*
        Info[] person  = {new Info("이수연", "B형 ", 17),
                            new Info("홍길동", "AB형", 41),
                            new Info("김수현", "O형 ", 25),
                            new Info("김남일", "B형 ", 33)}
         */
        Info[] person = new Info[4];
        person[0] = new Info("이수연", "B형 ", 17);
        person[1] = new Info("홍길동", "AB형", 41);
        person[2] = new Info("김수현", "O형 ", 25);
        person[3] = new Info("김남일", "B형 ", 33);
        System.out.println("총" + Info.count + "명 정보 출력");
        System.out.println("이름\t\t혈액형\t\t나이");
        System.out.println("--------------------------------");
        for(int i = 0; i < person.length; i++) {
            person[i].write();
        }
    }
}
