package Day_0603;

import java.util.Scanner;

public class SawonPayTest_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sawon_07 sawon;
        String name;
        int gibon, famsu, tsu;

        System.out.println("사원명은?");
        name = sc.nextLine();
        System.out.println("기본급은?");
        gibon = sc.nextInt();
        System.out.println("총 가족수는?");
        famsu = sc.nextInt();
        System.out.println("총 시간외 근무시간은?");
        tsu = sc.nextInt();

//      생성
        sawon = new Sawon_07(name, gibon, tsu, famsu);
    }
}
