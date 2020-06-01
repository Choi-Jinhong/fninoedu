package Day_0529;

public class ArrayMaxMin_05 {
    public static void main(String[] args) {
//      배열의 최댓값, 최소값 구하기
        int[] data = {5, 12, 123, 67, 88, 45, 99, 100};

//      첫 데이터를 무조건 최댓값, 최소값으로 지정
        int max = data[0];
        int min = data[0];

//      두번째 데이터부터 끝까지 max와 비교
        for(int i = 1; i < data.length; i++){
            if(max < data[i])
                max = data[i];
        }
        System.out.println("최대 값: " + max);

//      두번째 데이터부터 끝까지 min과 비교
        for(int i = 1; i < data.length; i++){
            if(min > data[i])
                min = data[i];
        }
        System.out.println("최소 값: " + min);
    }
}
