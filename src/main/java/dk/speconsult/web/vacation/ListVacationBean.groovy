package dk.speconsult.web.vacation;

import dk.speconsult.web.BaseActionBean;
import net.sourceforge.stripes.action.Resolution
import dk.speconsult.model.Employee
import net.sourceforge.stripes.validation.Validate
import net.sourceforge.stripes.action.DefaultHandler
import dk.speconsult.model.Company;

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 07-04-11
 * Time: 22:04
 * To change this template use File | Settings | File Templates.
 */
public class ListVacationBean extends BaseActionBean {

    @Validate(on=["listVacationForEmployee"], required=true)
    int id

    Employee employee
    List<Employee> employees

    @DefaultHandler
    public Resolution listVacationsForAll() {
        Company company = getCompany()
        employees = Employee.find("company_id=${company.id}").include(Company.class);
        forward(EMPLOYEE_LIST_JSP)
    }

    public Resolution listVacationForEmployee() {
        employee = Employee.findById(id);
        return forward(EMPLOYEE_EDIT_JSP)
    }

}
