package dachuang.industry.supervision.backend.platform.bl.response.user;

import dachuang.industry.supervision.backend.platform.entity.User;
import lombok.Data;

@Data
public class InsertUserResponse {
    private User user;
    public InsertUserResponse(User user){
        this.user = user;
    }
}
