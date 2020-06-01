package Day_0601;

public class InfoData_15 {
    String name;
    String gender;
    String addr;

    static String ban;
    static int cnt;
    public void setData(String name, String gender, String addr){
        this.name = name;
        this.gender = gender;
        this.addr = addr;
    }

    public void getData(){
        cnt++;
        System.out.println("***학생" + cnt + "번째 정보 ***");
        System.out.println("이름: " + this.name);
        System.out.println("소속 학급: " + InfoData_15.ban);
        System.out.println("성별: " + this.gender);
        System.out.println("주소: " + this.addr);
    }
}
