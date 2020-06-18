package profile.model;

import java.sql.Timestamp;

public class ProfileDTO {
    String num ="";
    String name = "";
    String blood ="";
    String hp ="";
    Timestamp birth;

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setBirth(Timestamp birth) {
        this.birth = birth;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public Timestamp getBirth() {
        return birth;
    }

    public String getBlood() {
        return blood;
    }

    public String getHp() {
        return hp;
    }
}
