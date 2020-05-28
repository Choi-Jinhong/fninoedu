package Day_0528;

public class DoubleFor_06 {
    public static void main(String[] args) {
//      중첩 반복문
        for(int i = 1; i <= 2; i++)
            for(int j = 1; j <= 3; j++)
                System.out.println(i + " " + j);
        Gugudan();
    }

//  구구단
    public static void Gugudan(){
        for(int i = 1; i <= 9; i++) // 앞부분
            for(int j = 1; j <= 9; j++)  // 뒷부분
                System.out.println(i + " X " + j + " = " + i*j );
    }
}
