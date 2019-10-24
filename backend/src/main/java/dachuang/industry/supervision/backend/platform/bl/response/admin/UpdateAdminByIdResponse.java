package dachuang.industry.supervision.backend.platform.bl.response.admin;

import lombok.Data;

@Data
public class UpdateAdminByIdResponse {
    private int id;
    private String phone;
    private String wx_id;
    public UpdateAdminByIdResponse(int id, String phone, String wx_id){
        this.id = id;
        this.phone = phone;
        this.wx_id = wx_id;
    }
}
