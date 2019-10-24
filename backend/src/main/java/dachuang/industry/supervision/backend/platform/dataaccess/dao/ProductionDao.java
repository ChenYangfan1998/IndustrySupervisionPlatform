package dachuang.industry.supervision.backend.platform.dataaccess.dao;

import dachuang.industry.supervision.backend.platform.entity.Production;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionDao extends JpaRepository<Production, Integer> {
}
