package dachuang.industry.supervision.backend.platform.bl.serviceinterface;

import dachuang.industry.supervision.backend.platform.bl.parameter.admin.InsertAdminParameter;
import dachuang.industry.supervision.backend.platform.bl.parameter.admin.UpdateAdminByIdParameter;
import dachuang.industry.supervision.backend.platform.bl.response.admin.InsertAdminResponse;
import dachuang.industry.supervision.backend.platform.bl.response.admin.UpdateAdminByIdResponse;

public interface AdminBlService {
    UpdateAdminByIdResponse updateAdminById(UpdateAdminByIdParameter parameter);
    InsertAdminResponse insertAdmin(InsertAdminParameter parameter);
}
