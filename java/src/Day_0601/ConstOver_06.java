package Day_0601;

class Apple{
//  디폴트 생성자
    public Apple(){
        System.out.println("Call Default Construtor Apple()");
    }
}

class Banana{
//  생성자
    public Banana(String str){
        System.out.println("Call Constructor Banana(): " + str);
    }
}

class Orange{
//   Overloading
    public Orange(){
        System.out.println("Call Default Constructor Orange()");
    }
    public Orange(String str){
        System.out.println("2nd Constructor of Orange(): " + str);
    }
    public Orange(int n){
        System.out.println("3rd Constructor of Orange(): " + n);
    }
    public Orange(String str, int n){
        System.out.println("4th Construtcor of Orange(): " + str + " " + n);
    }
}

public class ConstOver_06 {
    public static void main(String[] args) {
        Apple a = new Apple();
        Banana b = new Banana("바나나");
        System.out.println("-----------Overloading--------------");
        Orange o1 = new Orange();
        Orange o2 = new Orange("Orange");
        Orange o3 = new Orange(10);
        Orange o4 = new Orange("Orange", 10);
    }
}
