package dachuang.industry.supervision.backend.platform.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "production")
@Data
public class Production {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private int date;

    @Column(name = "data")
    private String data;

    public Production(){}
    public Production(int id, int date, String data){
        this.id = id;
        this.date = date;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
