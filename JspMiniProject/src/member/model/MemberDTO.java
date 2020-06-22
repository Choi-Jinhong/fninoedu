package member.model;

import java.sql.Timestamp;

public class MemberDTO {

    private String num;
    private String name;
    private String id;
    private String pwd;
    private Timestamp sday;

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public Timestamp getSday() {
        return sday;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setSday(Timestamp sday) {
        this.sday = sday;
    }
}
