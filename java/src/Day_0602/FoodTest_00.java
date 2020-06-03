package Day_0602;

class Food{
    private String menu;
    private int price;

    static int menuNo;

    public void setFood(String menu, int price){
        this.menu = menu;
        this.price = price;
    }

    public void getFood(){
        menuNo++;
        System.out.println("[메뉴_" + menuNo + "]");
        System.out.println("메뉴 명: " + menu);
        System.out.println("가격: " + price);
        System.out.println("-----------------------");
    }
}

public class FoodTest_00 {
    public static void main(String[] args) {
        Food f1 = new Food();
        f1.setFood("스파게트", 180000);
        f1.getFood();

        Food f2 = new Food();
        f2.setFood("파스타", 150000);
        f2.getFood();

        Food f3 = new Food();
        f3.setFood("미트볼", 170000);
        f3.getFood();
    }
}
//내부 클래스를 쓰는 이유
//자바는 단일 상속밖에 되지 않기 때문에 다중 상속을 위해서