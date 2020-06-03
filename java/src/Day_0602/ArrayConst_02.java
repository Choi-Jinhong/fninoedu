package Day_0602;

class Shop{
    private String thing;
    private int price;
    private String color;

//  생성자
    public Shop(String t, int p, String c){
        thing = t;
        price = p;
        color = c;
    }

//  제목 가로 나열
    public static void showTitle(){
        System.out.println("상품명\t\t단가\t\t색상");
        System.out.println("------------------------------");
    }

//  출력
    public void getInfo(){
        System.out.println(thing + "\t\t" + price + "\t\t" + color);
    }
}

public class ArrayConst_02 {
    public static void main(String[] args) {
        Shop[] s = new Shop[5];

        s[0] = new Shop("블라우스", 12000, "화이트");
        s[1] = new Shop("레깅스", 45000, "블루");
        s[2] = new Shop("청바지", 50000, "블루");
        s[3] = new Shop("져지", 42000, "옐로우");
        s[4] = new Shop("면바지", 40000, "블루");

        Shop.showTitle();
        for (Shop shop : s)
            shop.getInfo();
    }
}
