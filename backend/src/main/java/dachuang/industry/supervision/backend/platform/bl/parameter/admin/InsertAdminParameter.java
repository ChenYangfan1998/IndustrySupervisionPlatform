package dachuang.industry.supervision.backend.platform.bl.parameter.admin;

import lombok.Data;

@Data
public class InsertAdminParameter {
    int id;
    String wx_id;
    String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWx_id() {
        return wx_id;
    }

    public void setWx_id(String wx_id) {
        this.wx_id = wx_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
