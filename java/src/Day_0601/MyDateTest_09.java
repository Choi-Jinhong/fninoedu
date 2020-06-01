package Day_0601;

class MyDate{
//  인스턴스 변수 선언
    int year, month, day;

//  생성자 3개 생성 -> 명시적 생성자 3개를 생성
//  이 때 명싱적 생성자를 3개 만들 경우 Default는 제외
    MyDate(int y, int m, int d){
        year = y;
        month = m;
        day = d;
    }

//  각각의 setter, getter
//  Alt + insert => getter, setter 자동 생성
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

public class MyDateTest_09 {
    public static void main(String[] args) {
        MyDate md = new MyDate(2020, 5,30);
        System.out.println(md.getYear());
        System.out.println(md.getMonth());
        System.out.println(md.getDay());
    }
}
