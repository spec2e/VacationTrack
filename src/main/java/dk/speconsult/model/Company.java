package dk.speconsult.model;

import activejdbc.Model;
import activejdbc.annotations.Table;

public class Company extends Model {

    public void setId(int id) {
        super.setId(id);
    }

    public int getCompanyId() {
        return getInteger("id");
    }

    public String getName() {
        return getString("company");
    }

    public void setName(String company) {
        setString("company", company);
    }

}
