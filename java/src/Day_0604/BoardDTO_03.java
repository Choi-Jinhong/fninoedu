package Day_0604;

public class BoardDTO_03 {
    private String name;
    private String subject;
    private String content;

    public BoardDTO_03(String n, String sub, String con){
        name = n;
        subject = sub;
        content = con;
    }

//  setter, getter

    public void setContent(String content) {
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
}
