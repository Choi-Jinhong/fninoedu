package Day_0528;

public class ForWhileReview_00 {

    public static void main(String[] args) {
        forEx();
        whileEX();
        whileTrueEx();
        forEX2();
    }

//  for으로 반복 ---> test1()
    public static void forEx() {
        System.out.println("------------forEX-----------");
        for(int i = 1; i <= 5; i++)
            System.out.println("I love java" + i);
    }

//  while로 반복 ---> test2()
    public static void whileEX(){
        System.out.println("-----------whileEx---------");
        int i = 1;
        while(i <= 5){
            System.out.println("I love java" + i);
            i++;
        }
    }

//  while 무한 루프로 반복 ---> test3()
    public static void whileTrueEx(){
        System.out.println("--------whileTrueEx---------");
        int cnt = 1;
        while(true){
            if(cnt > 5)
                break;
            else
                System.out.println("I love java" + cnt);
            cnt++;
        }
    }

    //  for 반복 ---> test5()
    public static void forEX2(){
        System.out.println("---------forEX2()-----------");
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("종료!!");
    }
}
