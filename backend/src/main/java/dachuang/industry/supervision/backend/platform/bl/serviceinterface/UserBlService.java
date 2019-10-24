package dachuang.industry.supervision.backend.platform.bl.serviceinterface;

import dachuang.industry.supervision.backend.platform.bl.parameter.user.InsertUserParameter;
import dachuang.industry.supervision.backend.platform.bl.parameter.user.UpdateUserByIdParameter;
import dachuang.industry.supervision.backend.platform.bl.response.user.GetUserByIdResponse;
import dachuang.industry.supervision.backend.platform.bl.response.user.InsertUserResponse;
import dachuang.industry.supervision.backend.platform.bl.response.user.UpdateUserByIdResponse;

public interface UserBlService {
    GetUserByIdResponse getUserById(int id);
    UpdateUserByIdResponse updateUserById(UpdateUserByIdParameter parameter);
    InsertUserResponse insertUser(InsertUserParameter parameter);
}
