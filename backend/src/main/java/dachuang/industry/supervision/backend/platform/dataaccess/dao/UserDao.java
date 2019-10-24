package dachuang.industry.supervision.backend.platform.dataaccess.dao;

import dachuang.industry.supervision.backend.platform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
