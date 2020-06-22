package myBoard.model;

import java.sql.Timestamp;

public class MyBoardDTO {
    String num ="";
    String name = "";
    String subject = "";
    String content = "";
    Timestamp sdate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSdate(Timestamp sdate) {
        this.sdate = sdate;
    }

    public Timestamp getSdate() {
        return sdate;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
