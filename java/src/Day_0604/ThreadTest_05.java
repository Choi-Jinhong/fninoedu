package Day_0604;
// Thread를 상속 받았을 때
public class ThreadTest_05 extends Thread{

    String name;
    int num;

    public ThreadTest_05(String name, int num){
        this.name = name;
        this.num = num;
    }

    public void run(){
        for(int i = 1; i <= num; i++){
            System.out.println(name + " -> " + i);
        }
    }

    public static void main(String[] args) {
        ThreadTest_05 th1 = new ThreadTest_05("one", 100);
        ThreadTest_05 th2 = new ThreadTest_05("two", 200);
        ThreadTest_05 th3 = new ThreadTest_05("three", 300);

        th1.start(); //run 메소드 호출 방법이 start이다.
        th2.start();
        th3.start();
    }
}
