package dk.speconsult.web.employee

import net.sourceforge.stripes.action.Resolution
import net.sourceforge.stripes.action.DefaultHandler
import dk.speconsult.model.Employee
import dk.speconsult.model.Company
import activejdbc.Base
import dk.speconsult.web.BaseActionBean

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 26-03-11
 * Time: 22:01
 * To change this template use File | Settings | File Templates.
 */
public class ListEmployeesActionBean extends BaseActionBean {

    List<Employee> employees;

    @DefaultHandler
    public Resolution listEmployees() {
        Company company = getCompany()
        employees = Employee.find("company_id=${company.id}").include(Company.class);
        forward(EMPLOYEE_LIST_JSP)
    }


}
