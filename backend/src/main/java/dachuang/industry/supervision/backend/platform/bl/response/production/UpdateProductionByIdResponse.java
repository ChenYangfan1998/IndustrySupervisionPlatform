package dachuang.industry.supervision.backend.platform.bl.response.production;

import lombok.Data;

@Data
public class UpdateProductionByIdResponse {
    private int id;
    private int date;
    private String data;
    public UpdateProductionByIdResponse(int id, int date, String data){
        this.id = id;
        this.date = date;
        this.data = data;
    }

}
