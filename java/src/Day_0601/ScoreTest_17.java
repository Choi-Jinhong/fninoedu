package Day_0601;

class Score{
    private String name;
    private int java;
    private int spring;

    static final String TITLE = "중간고사 결과"; // 보통 대문자로 만듦

//  setter, getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getSpring() {
        return spring;
    }

    public void setSpring(int spring) {
        this.spring = spring;
    }

    public int getSum(int java, int spring){
        int sum = java + spring;
        return sum;
    }

    public double getAvg(){
        return getSum(java, spring) / 2.0;
    }
}

public class ScoreTest_17 {
    public static void main(String[] args) {
        Score s = new Score();
        s.setName("박지윤");
        s.setJava(88);
        s.setSpring(99);
        System.out.println(s.TITLE);
        System.out.println("이름: " + s.getName());
        System.out.println("자바: " + s.getJava());
        System.out.println("스프링: " + s.getSpring());
        System.out.println("합계: " + s.getSum(s.getJava(), s.getSpring()));
        System.out.println("평균: " + s.getAvg());
    }
}
