package dachuang.industry.supervision.backend.platform.dataaccess.serviceimpl;

import dachuang.industry.supervision.backend.platform.dataaccess.dao.AdminDao;
import dachuang.industry.supervision.backend.platform.dataaccess.serviceinterface.AdminDataAccessService;
import dachuang.industry.supervision.backend.platform.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDataAccessServiceImpl implements AdminDataAccessService {
    private final AdminDao adminDao;
    @Autowired
    public AdminDataAccessServiceImpl(AdminDao adminDao){
        this.adminDao = adminDao;
    }

    @Override
    public Admin GetAdminById(int id) {
        return adminDao.findById(id).orElse(null);
    }

    @Override
    public Admin UpdateAdminById(int id, String phone, String wx_id) {
        return adminDao.save(new Admin(id, phone, wx_id));
    }

    @Override
    public Admin InsertAdminById(int id, String phone, String wx_id) {
        return adminDao.save(new Admin(id, phone, wx_id));
    }
}
