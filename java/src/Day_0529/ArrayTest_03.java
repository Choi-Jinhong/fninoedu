package Day_0529;

public class ArrayTest_03 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 11, 12, 2, 3};

        System.out.println("갯수: " + arr.length);

        System.out.println("for 출력");
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        System.out.println("for-each 출력");
        for(int a: arr)
            System.out.println(a);
    }
}
