package Day_0529;

public class ArrayTest_01 {
    public static void main(String[] args) {
//      배열 선언
//      기본형 배열은 객체로 인식
        int[] arr1, arr2;

        arr1 = new int[3];
        arr2 = new int[5];

        arr1[0] = 10;
        arr1[1] = 5;
        arr1[2] = 20;

        System.out.println("arr1의 배열의 갯수: " + arr1.length);
        System.out.println("-----------[arr1]----------");
//      출력 시 반드시 반복문으로 출력 할 것
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("-----------[arr1]----------");
//      for-each 문
//      int a에 arr1의 값이 순차적으로 대입
        for(int a: arr1){
            System.out.println(a);
        }
        System.out.println("-----------[arr2]-----------");
        for(int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]);
    }
}
