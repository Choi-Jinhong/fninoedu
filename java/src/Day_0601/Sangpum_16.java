package Day_0601;

public class Sangpum_16 {
    private String sangpum;
    private int ea;
    private int price;

//  3개를 한 번에 수정하는 메소드
    public void setThing(String sangpum, int ea, int price){
        this.sangpum = sangpum;
        this.ea = ea;
        this.price =price;
    }
//  3개를 한 번에 출력하는 메소드
    public void getThing(){
        System.out.println("상품명: " + sangpum);
        System.out.println("수량: " + ea + "개");
        System.out.println("단가: " + price + "원");
    }
}
