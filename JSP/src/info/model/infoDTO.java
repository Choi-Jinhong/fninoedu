package info.model;

import java.sql.Timestamp;

public class infoDTO {
    private String addr;
    private String name;
    private String num;
    private Timestamp sdate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setSdate(Timestamp sdate) {
        this.sdate = sdate;
    }

    public Timestamp getSdate() {
        return sdate;
    }
}
