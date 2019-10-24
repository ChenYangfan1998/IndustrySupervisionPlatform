package dachuang.industry.supervision.backend.platform.bl.parameter.production;

import lombok.Data;

@Data
public class UpdateProductionByIdParameter {
    int id;
    int date;
    String data;

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
