package dachuang.industry.supervision.backend.platform.dataaccess.serviceinterface;

import dachuang.industry.supervision.backend.platform.entity.Production;

public interface ProductionDataAccessService {
    Production GetProductionById(int id);
    Production UpdateProductionById(int id, int date, String data);//TODO  production内容
    Production InsertProductionById(int id, int date, String data);//TODO

}
