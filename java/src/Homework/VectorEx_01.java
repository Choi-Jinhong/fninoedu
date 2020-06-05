package Homework;

import java.util.Scanner;
import java.util.Vector;

class VectorBoard{
    String name;
    int javaScore;
    int springScore;
    double average;

    public VectorBoard(String n, int j, int s, double a){
        name = n;
        javaScore = j;
        springScore = s;
        average = a;
    }

    public int getSpringScore() {
        return springScore;
    }

    public int getJavaScore() {
        return javaScore;
    }

    public String getName() {
        return name;
    }

    public double getAverage(){
        return average;
    }
}

public class VectorEx_01 {
    Vector<VectorBoard> list = new Vector<VectorBoard>();

    public void setBoard(){
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해주세요.");
        String name = sc.nextLine();
        System.out.print("Java 점수를 입력해주세요.");
        int java = sc.nextInt();
        System.out.print("Spring 점수를 입력해주세요.");
        int spring = sc.nextInt();
        double avg = (java + spring) / 2.0;

        VectorBoard vb = new VectorBoard(name, java, spring, avg);

        list.add(vb);
    }

    public void getBoard(){
        String comment;
        System.out.println("*************************************[시험 점수]***********************************");
        System.out.println("No\t\t이름\t\t자바\t\t스프링\t\t평균\t\t평가\t\t");
        System.out.println("----------------------------------------------------------------------------------");
        for(int i = 0; i < list.size(); i++){
            VectorBoard temp = list.get(i);
            if(temp.getAverage() >= 90)
                comment = "참 잘했어요!!";
            else if(temp.getAverage() >= 80)
                comment = "노력바람";
            else
                comment = "재수강";
            System.out.println((i+1) + "\t\t" + temp.getName() + "\t\t" + temp.getJavaScore() + "\t\t" + temp.getSpringScore() + "\t\t" + temp.getAverage() + "\t\t" + comment);
        }
    }
    public static void main(String[] args) {
        VectorEx_01 vb = new VectorEx_01();
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("원하시는 기능을 선택해주세요.");
            System.out.println("1. 점수입력\t2. 점수출력\t9. 종료");
            choice = sc.nextInt();
            if(choice == 1)
                vb.setBoard();
            else if(choice == 2)
                vb.getBoard();
            else
                break;
        }
    }
}
