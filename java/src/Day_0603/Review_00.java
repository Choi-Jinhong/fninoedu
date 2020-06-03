package Day_0603;
class Info{
    private String name;
    private int age;
    private int scoreJava;
    private int scoreJsp;
    private int sum;
    private double avg;
    static int num = 1;

    public Info(String n, int a, int scoreJava, int scoreJsp){
        name = n;
        age = a;
        this.scoreJava = scoreJava;
        this.scoreJsp = scoreJsp;
        sum = scoreJava + scoreJsp;
        avg = sum / 2.0;
    }

    public void student(){
        System.out.println(num + "\t\t" + name + "\t" + age + "세\t" + scoreJava + "점\t" + scoreJsp + "점\t" + sum + "점\t" + avg + "점");
        num++;
    }
}

public class Review_00 {
    public static void main(String[] args) {
        System.out.println("번호\t이름\t나이\tjava\tjsp\t\t합계\t평균");
        System.out.println("======================================================");
        Info[] info = {new Info("이지선", 22, 88, 99),
                new Info("김희애", 33, 100, 65),
                new Info("박선영", 32, 77, 68),
                new Info("김선아", 44, 79, 87),
                new Info("박지선", 34, 88, 66)};
        for(int i = 0; i < info.length; i++)
            info[i].student();
    }
}
