package dk.speconsult.ext;

import dk.speconsult.model.Company;
import dk.speconsult.model.Employee;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 21-03-11
 * Time: 21:56
 * To change this template use File | Settings | File Templates.
 */
public class VacationTrackActionBeanContext extends ActionBeanContext {

    protected static final String COMPANY = "company";

    public Company getCompany() {
        //return (Company) this.getRequest().getSession().getAttribute(COMPANY);
        return (Company) Company.findById(2);
    }

    public void setCompany(Company company) {
        this.getRequest().getSession().setAttribute(COMPANY, company);
    }

}
