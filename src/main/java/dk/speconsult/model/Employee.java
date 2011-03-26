package dk.speconsult.model;

import activejdbc.Model;
import activejdbc.annotations.BelongsTo;

/**
 * Created by IntelliJ IDEA.
 * User: Soren Pedersen
 * Date: 18-03-11
 * Time: 22:02
 * To change this template use File | Settings | File Templates.
 */
public class Employee extends Model {

    public String getFirstName() {
        return getString("firstname");
    }

    public void setFirstName(String firstName) {
        setString("firstname", firstName);
    }

    public String getLastName() {
        return getString("lastname");
    }

    public void setLastName(String lastName) {
        setString("lastname", lastName);
    }

    public String getEmployeeId() {
        return getString("employeeid");
    }

    public void setEmployeeId(String employeeId) {
        setString("employeeid", employeeId);
    }

    public int getAdministrator() {
        return getInteger("administrator");
    }

    public void setAdministrator(int administrator) {
        setInteger("administrator", administrator);
    }

    public boolean isAdministrator() {
        return getAdministrator() == 1;
    }

    public int getCompanyId() {
        return getInteger("company_id");
    }

    public void setCompanyId(int companyId) {
        setInteger("company_id", companyId);
    }
}
