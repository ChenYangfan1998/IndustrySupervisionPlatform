package dachuang.industry.supervision.backend.platform.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "station_1")
@Data
public class Station_1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public Station_1(){}
    public Station_1(int id){
        this.id = id;
    }
}
