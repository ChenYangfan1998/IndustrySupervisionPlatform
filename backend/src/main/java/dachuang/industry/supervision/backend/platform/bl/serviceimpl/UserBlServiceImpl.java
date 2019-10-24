package dachuang.industry.supervision.backend.platform.bl.serviceimpl;

import dachuang.industry.supervision.backend.platform.bl.parameter.user.InsertUserParameter;
import dachuang.industry.supervision.backend.platform.bl.parameter.user.UpdateUserByIdParameter;
import dachuang.industry.supervision.backend.platform.bl.response.user.GetUserByIdResponse;
import dachuang.industry.supervision.backend.platform.bl.response.user.InsertUserResponse;
import dachuang.industry.supervision.backend.platform.bl.response.user.UpdateUserByIdResponse;
import dachuang.industry.supervision.backend.platform.bl.serviceinterface.UserBlService;
import dachuang.industry.supervision.backend.platform.dataaccess.serviceinterface.UserDataAccessService;
import dachuang.industry.supervision.backend.platform.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBlServiceImpl implements UserBlService {
    private final UserDataAccessService userDataAccessService;

    @Autowired
    public UserBlServiceImpl(UserDataAccessService userDataAccessService){
        this.userDataAccessService = userDataAccessService;
    }
    @Override
    public GetUserByIdResponse getUserById(int id) {
        User res = userDataAccessService.GetUserById(id);
        return new GetUserByIdResponse(res);
    }

    @Override
    public UpdateUserByIdResponse updateUserById(UpdateUserByIdParameter parameter) {
        User res = userDataAccessService.UpdateUserById(parameter.getId(), parameter.getPhone(), parameter.getWx_id());
        return new UpdateUserByIdResponse(res.getId(), res.getPhone(), res.getWx_id());
    }

    @Override
    public InsertUserResponse insertUser(InsertUserParameter parameter) {
        User res = userDataAccessService.InsertUser(parameter.getId(), parameter.getWx_id(), parameter.getPhone());
        return new InsertUserResponse(res) ;
    }
}
