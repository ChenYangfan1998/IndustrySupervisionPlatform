package dachuang.industry.supervision.backend.platform.dataaccess.serviceimpl;

import dachuang.industry.supervision.backend.platform.dataaccess.dao.UserDao;
import dachuang.industry.supervision.backend.platform.dataaccess.serviceinterface.UserDataAccessService;
import dachuang.industry.supervision.backend.platform.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataAccessServiceImpl implements UserDataAccessService {
    private final UserDao userDao;
    @Autowired
    public UserDataAccessServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public User GetUserById(int id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public User UpdateUserById(int id, String phone, String wx_id) {
        return userDao.save(new User(id, phone, wx_id));
    }

    @Override
    public User InsertUser(int id, String phone, String wx_id) {
        return userDao.save(new User(id, phone, wx_id));
    }

}
