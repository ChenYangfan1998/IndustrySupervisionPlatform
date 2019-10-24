package dachuang.industry.supervision.backend.platform.dataaccess.serviceinterface;

import dachuang.industry.supervision.backend.platform.entity.User;

public interface UserDataAccessService {
    User GetUserById(int id);
    User UpdateUserById(int id, String phone, String wx_id);
    User InsertUser(int id, String phone, String wx_id);
}
