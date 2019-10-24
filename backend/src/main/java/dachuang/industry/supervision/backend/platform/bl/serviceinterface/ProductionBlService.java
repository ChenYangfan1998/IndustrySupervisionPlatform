package dachuang.industry.supervision.backend.platform.bl.serviceinterface;

import dachuang.industry.supervision.backend.platform.bl.parameter.production.UpdateProductionByIdParameter;
import dachuang.industry.supervision.backend.platform.bl.response.production.GetProductionByIdResponse;
import dachuang.industry.supervision.backend.platform.bl.response.production.UpdateProductionByIdResponse;

public interface ProductionBlService {
    GetProductionByIdResponse getProductionById(int id);
    UpdateProductionByIdResponse updateProductionById(UpdateProductionByIdParameter parameter);
}
