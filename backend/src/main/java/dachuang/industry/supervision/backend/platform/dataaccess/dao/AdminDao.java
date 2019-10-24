package dachuang.industry.supervision.backend.platform.dataaccess.dao;

import dachuang.industry.supervision.backend.platform.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin, Integer> {
}
