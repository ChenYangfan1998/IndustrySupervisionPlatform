package dachuang.industry.supervision.backend.platform.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "station_1")
@Data
public class Station_2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public Station_2(){}
    public Station_2(int id){
        this.id = id;
    }

}
