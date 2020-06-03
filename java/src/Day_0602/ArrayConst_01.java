package Day_0602;

class Student_01{
    private String name;
    private String hp;
    private int score;

    public Student_01(String name, String hp, int score){
        this.name = name;
        this. hp = hp;
        this.score = score;
    }

    public void getData(){
        System.out.println("학생명: " + name);
        System.out.println("전화번호: " + hp);
        System.out.println("점수: " + score);
    }
}

public class ArrayConst_01 {
    public static void main(String[] args) {
        Student_01[] stu = new Student_01[4];

        stu[0] = new Student_01("송혜교", "010-0000-0000", 40);
        stu[1] = new Student_01("윤민수", "010-0000-0000", 60);
        stu[2] = new Student_01("박보검", "010-0000-0000", 80);
        stu[3] = new Student_01("송준기", "010-0000-0000", 100);

        for(int i = 0; i < stu.length; i++) {
            stu[i].getData();
            System.out.println("--------------------------");
        }
    }
}
