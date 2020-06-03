package Day_0603;

public class ArrayIndexExp_09 {
    public static void main(String[] args) {
        String[] str = {"apple", "banana", "oragne", "kiwi"};

        System.out.println("차례대로 출력");
        for(int i = 0; i < str.length; i++){
            try{
                System.out.println(str[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 요구: " + e.getMessage());
            }
        }
        System.out.println("반대로 출력");
        for(int i = str.length - 1; i >= 0; i--){
            try{
                System.out.println(str[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 요구: " + e.getMessage());
            }
        }
    }
}
