package dachuang.industry.supervision.backend.platform.bl.serviceimpl;

import dachuang.industry.supervision.backend.platform.bl.parameter.production.UpdateProductionByIdParameter;
import dachuang.industry.supervision.backend.platform.bl.response.production.GetProductionByIdResponse;
import dachuang.industry.supervision.backend.platform.bl.response.production.UpdateProductionByIdResponse;
import dachuang.industry.supervision.backend.platform.bl.serviceinterface.ProductionBlService;
import dachuang.industry.supervision.backend.platform.dataaccess.serviceinterface.ProductionDataAccessService;
import dachuang.industry.supervision.backend.platform.entity.Production;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductionBlServiceImpl implements ProductionBlService {
    private final ProductionDataAccessService productionDataAccessService;

    @Autowired
    public ProductionBlServiceImpl(ProductionDataAccessService productionDataAccessService){
        this.productionDataAccessService = productionDataAccessService;
    }
    @Override
    public GetProductionByIdResponse getProductionById(int id) {
        Production res = productionDataAccessService.GetProductionById(id);
        return new GetProductionByIdResponse(res);
    }

    @Override
    public UpdateProductionByIdResponse updateProductionById(UpdateProductionByIdParameter parameter) {
        Production res = productionDataAccessService.UpdateProductionById(parameter.getId(), parameter.getDate(), parameter.getData());
        return new UpdateProductionByIdResponse(res.getId(), res.getDate(), res.getData());
    }
}
