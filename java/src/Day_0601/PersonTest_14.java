package Day_0601;

class Person01{
    private String univ;
    private String major;
    private int grade;
    private String name;

    public Person01(String univ, String major, int grade, String name){
        this.univ = univ;
        this.major = major;
        this.grade = grade;
        this.name = name;
    }
    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class PersonTest_14 {
    public static void main(String[] args) {
        Person01 p1 = new Person01("혁신대학교", "컴퓨터공학과", 4, "최진홍");
        System.out.println("[신상정보]");
        System.out.println("이름: " + p1.getName());
        System.out.println("학교: " + p1.getUniv());
        System.out.println("전공: " + p1.getMajor());
        System.out.println("학년: " + p1.getGrade());
    }
}
