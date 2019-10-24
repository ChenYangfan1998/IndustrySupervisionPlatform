package dachuang.industry.supervision.backend.platform.bl.response.admin;

import dachuang.industry.supervision.backend.platform.entity.Admin;
import lombok.Data;

@Data
public class InsertAdminResponse {
    private Admin admin;
    public InsertAdminResponse(Admin admin){
        this.admin = admin;
    }
}
