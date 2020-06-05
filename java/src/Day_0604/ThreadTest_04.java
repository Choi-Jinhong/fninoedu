package Day_0604;
//      일반적인 경우
public class ThreadTest_04 {
    String name;
    int num;

    public ThreadTest_04(String name, int num){
        this.name = name;
        this.num = num;
    }

    public void run(){
        for(int i = 1; i <= num; i++){
            System.out.println(name + " -> " + i);
        }
    }
    public static void main(String[] args) {
        ThreadTest_04 th1 = new ThreadTest_04("one", 100);
        ThreadTest_04 th2 = new ThreadTest_04("two", 200);
        ThreadTest_04 th3 = new ThreadTest_04("three", 300);

        th1.run();
        th2.run();
        th3.run();
    }
}
