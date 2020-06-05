package Day_0604;

public class ThreadTest_06 implements Runnable{

    String name;
    int num;

    public ThreadTest_06(String name, int num){
        this.name = name;
        this.num = num;
    }

    public void run(){
        for(int i = 1; i <= num; i++){
            System.out.println(name + " -> " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ThreadTest_06 th1 = new ThreadTest_06("one", 100);
        ThreadTest_06 th2 = new ThreadTest_06("two", 200);
        ThreadTest_06 th3 = new ThreadTest_06("three", 300);

//      쓰레드 생성
        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        Thread t3 = new Thread(th3);

        t1.start(); //run 메소드 호출 방법이 start이다.
        t2.start();
        t3.start();
    }
}
