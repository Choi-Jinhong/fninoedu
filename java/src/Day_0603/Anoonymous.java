package Day_0603;
abstract class AbstEx{
    abstract public void show();
}

class OuterEx{
    AbstEx ab = new AbstEx(){
    
        @Override
        public void show() {
            // TODO Auto-generated method stub
            System.out.println("익명 내부 클래스");
        }
    };
}

public class Anoonymous {
    public static void main(String[] args){
        OuterEx ex = new OuterEx();
        ex.ab.show();
    }
}