package Day_0603;

public class Sawon_07 {
    private String sawonName;
    private int gibopay, timesu, familysu;

//  생성자
    public Sawon_07(String s, int g, int t, int f){
        sawonName = s;
        gibopay = g;
        timesu = t;
        familysu = f;
    }

    public int getFamilysu(){
        if(familysu < 3)
            return 500000;
        else
            return 70000;
    }

    public int getTimesu(){
        if(timesu<5)
            return  timesu*20000;
        else
            return 100000;
    }

    public int getTotalPay(){
        return 0;
    }
}
