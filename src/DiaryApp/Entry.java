package DiaryApp;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String tittle;
    private String body;
    private LocalDateTime dateCreated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Entry(int id, String tittle, String body){
        this.id = id;
        this.tittle = tittle;
        this.body = body;
    }

    public String toString() {
        return this.id + this.tittle + this.body;
    }
}
