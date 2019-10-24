package dachuang.industry.supervision.backend.platform.bl.response.user;

import lombok.Data;

@Data
public class UpdateUserByIdResponse {
    private int id;
    private String phone;
    private String wx_id;
    public UpdateUserByIdResponse(int id, String phone, String wx_id){
        this.id = id;
        this.phone = phone;
        this.wx_id = wx_id;
    }
}
