package dachuang.industry.supervision.backend.platform.dataaccess.serviceimpl;

import dachuang.industry.supervision.backend.platform.dataaccess.dao.ProductionDao;
import dachuang.industry.supervision.backend.platform.dataaccess.serviceinterface.ProductionDataAccessService;
import dachuang.industry.supervision.backend.platform.entity.Production;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductionDataAccessServiceImpl implements ProductionDataAccessService {
    private final ProductionDao productionDao;
    @Autowired
    public ProductionDataAccessServiceImpl(ProductionDao productionDao){
        this.productionDao = productionDao;
    }

    @Override
    public Production GetProductionById(int id) {
        return productionDao.findById(id).orElse(null);
    }

    @Override
    public Production UpdateProductionById(int id, int date, String data) {
        return productionDao.save(new Production(id, date, data));
    }

    @Override
    public Production InsertProductionById(int id, int date, String data) {
        return productionDao.save(new Production(id, date, data));
    }
}
