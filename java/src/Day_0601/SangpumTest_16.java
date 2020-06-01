package Day_0601;

public class SangpumTest_16 {
    public static void main(String[] args) {
        System.out.println("[상품정보]");
        Sangpum_16 sp1 = new Sangpum_16();
        sp1.setThing("초코파이", 20, 500);
        sp1.getThing();
        System.out.println("====================================");
        Sangpum_16 sp2 = new Sangpum_16();
        sp2.setThing("자갈치", 30, 1000);
        sp2.getThing();
        System.out.println("====================================");
        Sangpum_16 sp3 = new Sangpum_16();
        sp3.setThing("포테토칩", 10, 1500);
        sp3.getThing();
    }
}